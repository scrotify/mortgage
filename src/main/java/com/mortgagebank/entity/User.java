package com.mortgagebank.entity;

import java.time.LocalDate;
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
 * The type User.
 */
@Table(name = "user")
@Entity
@Getter
@Setter
@SequenceGenerator(name = "seq", initialValue = 1000)
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "mobileno")
    private Long mobileNo;

    @Column(name = "city")
    private String city;
    
    @Column(name = "age")
    private Integer age;
    
    @Column(name = "role")
    private String role;
    
    @Column(name = "salary")
    private Double salary;
    

   

   }