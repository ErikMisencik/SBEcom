package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @OneToOne(mappedBy = "payment", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Order order;

    @NotBlank
    @Size(min = 4, message = "Payment method must contain at least 4 character")
    private String paymentMethod;       // e.g., "Credit Card", "PayPal"

    private String pgPaymentId;
    private String pgStatus;            // e.g., "Success", "Failed", "Pending"
    private String pgResponseMessage; // e.g., "Payment completed successfully", "Insufficient funds"
    private String pgName;              // e.g., "Stripe", "PayPal", "Square"

    // Constructor for creating a Payment with essential fields
    public Payment(String paymentMethod, String pgPaymentId, String pgStatus, String pgResponseMessage, String pgName){
        this.paymentMethod = paymentMethod;
        this.pgPaymentId = pgPaymentId;
        this.pgStatus = pgStatus;
        this.pgResponseMessage = pgResponseMessage;
        this.pgName = pgName;
    }


}
