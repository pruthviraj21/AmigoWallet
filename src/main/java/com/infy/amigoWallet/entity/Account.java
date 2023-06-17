package com.infy.amigoWallet.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="account")
public class Account {
	@Id
	private long accountno;
	private String aname;
	private String ifsc;
	private double balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(long accountno, String aname, String ifsc, double balance) {
		super();
		this.accountno = accountno;
		this.aname = aname;
		this.ifsc = ifsc;
		this.balance = balance;
	}

	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}

	public String getName() {
		return aname;
	}

	public void setName(String aname) {
		this.aname = aname;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", aname=" + aname + ", ifsc=" + ifsc + ", balance=" + balance + "]";
	}
}
