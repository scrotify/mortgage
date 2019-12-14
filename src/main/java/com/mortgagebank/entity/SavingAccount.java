package com.mortgagebank.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Savings Account.
 */
@Entity
@Table(name = "saving_account")
@Getter
@Setter
@SequenceGenerator(name = "seq", initialValue = 100000)
public class SavingAccount implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(name = "account_no")
    private Long accountNo;

    @Column(name = "account_status")
    private String accountStatus;

    @Column(name = "balance")
    private Double balance;
    
    @Column(name = "id")
    private Long id;

    
}