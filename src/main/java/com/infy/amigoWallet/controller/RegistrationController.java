package com.infy.amigoWallet.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.amigoWallet.dto.CustomerDTO;
import com.infy.amigoWallet.dto.LoginDTO;

import com.infy.amigoWallet.service.CustomerService;


@RestController

public class RegistrationController {
	@Autowired
	CustomerService custservice;

	// register new user to AMIGOWALLET
	@PostMapping("customer")
	public ResponseEntity<CustomerDTO> createCustomer(@Valid @RequestBody CustomerDTO customerdto) {
		CustomerDTO dto = custservice.addCustomer(customerdto);
		System.out.println("Customer added ");
		return new ResponseEntity<CustomerDTO>(dto, HttpStatus.CREATED);
	}

	@PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean login(@RequestBody LoginDTO loginDTO) {
		return custservice.login(loginDTO);
	}

	// transfer money from one user wallet to another wallet
	@PutMapping(value = "usertouser", produces = "text/html")
	public ResponseEntity<String> TransferUsertoUser(@RequestParam("senderEmail") String senderEmail,
			@RequestParam("receiverEmail") String receiverEmail, @RequestParam("amount") double amount)
			throws Exception {
		String msg = custservice.transferUsertoUser(senderEmail, receiverEmail, amount);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	// transfer money from user wallet to user account
	@PutMapping("usertoaccount")
	public ResponseEntity<String> TransferUsertoAccount(@RequestParam("senderEmail") String senderEmail,
			@RequestParam("accountno") long accountno, @RequestParam("amount") double amount) throws Exception {
		String msg = custservice.transferUsertoAccount(senderEmail, accountno, amount);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	// transfer money from user account to user wallet(TOPUP)
	@PutMapping("accounttouser")
	public ResponseEntity<String> TransferAccounttoUser(@RequestParam("accountno") long accountno,
			@RequestParam("senderEmail") String senderEmail, @RequestParam("amount") double amount) throws Exception {
		String msg = custservice.transferUsertoAccount(senderEmail, accountno, amount);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
