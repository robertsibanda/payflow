package com.nx.payflow.model;

import jakarta.persistence.*;
import lombok.Data;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String transactionId;

    @Column(nullable = false)
    private String transactionType;

    @Column(unique = true, nullable = false)
    private String idempotencyKey;

    private TransactionStatus transactionStatus;

    private LocalDateTime createdAt;

    private LocalDateTime processedAt;

    private String sender;

    private String receiver;

    private String currency;

    @Enumerated(EnumType.STRING)
    private ClientTier senderTier;

    @Enumerated(EnumType.STRING)
    private ClientTier receiverTier;

    private int fraudScore;

    private String flagReason;

    private BigDecimal transactionAmount;


}
