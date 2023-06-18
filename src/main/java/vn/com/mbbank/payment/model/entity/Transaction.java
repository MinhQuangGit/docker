package vn.com.mbbank.payment.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Data
@Accessors
@Table(name = "transaction")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    Integer id;
    @Column(name = "TRANSACTION_ID")
    String transactionId;
    @Column(name = "DESCRIPTION")
    String description;
    @Column(name = "AMOUNT")
    Integer amount;
    @Column(name = "CREATED_AT")
    Date createdAt;
    @Column(name = "CREATED_BY")
    String createdBy;
    @Column(name = "UPDATED_AT")
    Date updatedAt;
    @Column(name = "UPDATED_BY")
    String updatedBy;
}
