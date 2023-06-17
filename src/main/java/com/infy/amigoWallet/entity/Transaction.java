package com.infy.amigoWallet.entity;

import java.time.LocalDateTime;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer transationId;
	private LocalDateTime time;
	private String type;
	private String remarks;
	private Double amount;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emailid")
	Customer customer;
	
	public Transaction() {
		super();
		
	}
	
	
	public Transaction(Integer transationId, LocalDateTime time, String type, String remarks, Double amount,
			Customer customer) {
		super();
		this.transationId = transationId;
		this.time = time;
		this.type = type;
		this.remarks = remarks;
		this.amount = amount;
		this.customer = customer;
	}


	public Integer getTransationId() {
		return transationId;
	}
	public void setTransationId(Integer transationId) {
		this.transationId = transationId;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Transaction [transationId=" + transationId + ", time=" + time + ", type=" + type + ", remarks="
				+ remarks + ", amount=" + amount + ", customer=" + customer + "]";
	}

}
