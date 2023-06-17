package com.infy.amigoWallet.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class AccountDTO {
	@Pattern(regexp="[[0-9]{11}")
	private long accountno;
	@Pattern(regexp="[\\w]+ [\\w]")
	private String aname;
	@Pattern(regexp="[A-Za-z]{4}+[0-9]{5}")
	private String ifsc;
	@Min(0)
	@Pattern(regexp="[0-9]+\\.[0-9]{2}")
	private double balance;

	public AccountDTO() {
		super();
		
	}

	public AccountDTO(long accountno, String aname, String ifsc, double balance) {
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
