package com.infy.amigoWallet.dto;


import javax.validation.constraints.Pattern;

import com.infy.amigoWallet.entity.Account;
import com.infy.amigoWallet.entity.Customer;

public class CustomerDTO {
	private String name;
	@Pattern( regexp = "[a-zA-Z0-9]+\\@(infy)+\\.(com|in)")
	private String emailId;
	private long phoneno;
	
	private double walletbalance;
	@Pattern( regexp = "[a-zA-Z0-9]+\\#(123)")
	private String password;

	public CustomerDTO() {
		super();
	}

	public CustomerDTO(String name, String emailId, long phoneno, Account account, double walletbalance) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.phoneno = phoneno;

		this.walletbalance = walletbalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getWalletbalance() {
		return walletbalance;
	}

	public void setWalletbalance(double walletbalance) {
		this.walletbalance = walletbalance;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailId=" + emailId + ", phonno=" + phoneno + ", walletbalance="
				+ walletbalance + "]";
	}

	public Customer createCustomerEntity(CustomerDTO customerdto) {
		Customer cust = new Customer();
		cust.setName(customerdto.getName());
		cust.setEmailId(customerdto.getEmailId());
		cust.setPassword(customerdto.getPassword());
		cust.setPhoneno(customerdto.getPhoneno());
		cust.setWalletbalance(customerdto.getWalletbalance());
		
		return cust;
	}
}
