package com.mortgagebank.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Transaction.
 */
@Entity
@Table(name = "transaction")
@Getter
@Setter
public class Transaction  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "mortgage_account_no")
    private Long mortgageAccountNo;

    @Column(name = "saving_account_no")
    private Long savingAccountNo;

    @Column(name = "transaction_date")
    private LocalDate transactionDate;

    @Column(name = "amount")
    private Double amount;
    
    @Column(name = "transaction_type")
    private String transactionType;
    

}