package com.infy.amigoWallet.dto;

import java.time.LocalDateTime;


import com.infy.amigoWallet.entity.Customer;
import com.infy.amigoWallet.entity.Transaction;

public class TransactionDTO {

	private Integer transationId;
	private LocalDateTime time;
	private String type;
	private String remarks;
	private Double amount;
	Customer customer;
	
	public TransactionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TransactionDTO(Integer transationId, LocalDateTime time, String type, String remarks, Double amount,
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
	public Transaction createTarnsctionEntity(TransactionDTO transactiondto) {
		Transaction transction = new Transaction();
		transction.setAmount(transactiondto.getAmount());
		transction.setRemarks(transactiondto.getRemarks());
		transction.setTime(transactiondto.getTime());
		transction.setTransationId(transactiondto.getTransationId());
		transction.setType(transactiondto.getType());
		transction.setCustomer(transactiondto.getCustomer());
		return transction;
	}
	
	
//	public static List<Transaction> getTransactions() {
//		return Arrays.asList(
//				new Transaction(1001134, LocalDateTime.of(2017, 4, 3, 11, 23, 31), "DR", "Paid phone bill", 533.0),
//				new Transaction(1001453, LocalDateTime.of(2017, 3, 12, 16, 32, 42), "DR", "Paid internet bill", 800.0),
//				new Transaction(1001271, LocalDateTime.of(2017, 3, 8, 19, 37, 38), "CR", "From bank account", 12000.0),
//				new Transaction(1001014, LocalDateTime.of(2017, 4, 22, 9, 49, 19), "DR", "Paid electricity bill", 672.0),
//				new Transaction(1001521, LocalDateTime.of(2017, 3, 17, 12, 17, 42), "CR", "From Jim", 15000.0),
//				new Transaction(1001343, LocalDateTime.of(2017, 4, 15, 14, 13, 2), "DR", "To bank account", 1500.0)
//				);
//	}
}
