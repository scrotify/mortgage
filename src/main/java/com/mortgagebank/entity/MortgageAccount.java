package com.mortgagebank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "mortgage")
@Entity
@Getter
@Setter
@SequenceGenerator(name = "seq", initialValue = 1000)
public class MortgageAccount {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	private Long mortgageAccountNo;
	
	@Column(name = "account_no")
	private double loanAmount;
	
	@Column(name = "remaining_loan_amount")
	private double remainingLoanAmount;
	
	@Column(name = "id")
	private Long id;

}
