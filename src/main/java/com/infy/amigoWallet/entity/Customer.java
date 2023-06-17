package com.infy.amigoWallet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.infy.amigoWallet.dto.CustomerDTO;

@Entity
public class Customer {

	@Id
	@Column(name = "emailid")
	private String emailId;
	private String name;
	private long phoneno;

	private double walletbalance;
	private String password;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String emailId, String name, long phonno, double walletbalance, String password) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.phoneno = phonno;
		this.walletbalance = walletbalance;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public double getWalletbalance() {
		return walletbalance;
	}

	public void setWalletbalance(double walletbalance) {
		this.walletbalance = walletbalance;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	

	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailId=" + emailId + ", phonno=" + phoneno + ", walletbalance="
				+ walletbalance + "]";
	}

	public CustomerDTO createDTO(Customer customer) {
		CustomerDTO customerdto = new CustomerDTO();
		customerdto.setName(customer.getName());
		customerdto.setEmailId(customer.getEmailId());
		customerdto.setPhoneno(customer.getPhoneno());
		customerdto.setPassword(customer.getPassword());
		customerdto.setWalletbalance(customer.getWalletbalance());
		
		return customerdto;
	}

}
