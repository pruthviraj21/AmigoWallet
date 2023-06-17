package com.infy.amigoWallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.amigoWallet.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	TransactionService transactionservice;

	@GetMapping("transactions")
	public void getAllTransactions() {

		for (int i = 0; i < 3; i++) {
			System.out.println("-------------Page " + (i + 1) + "-----------");
			PageRequest page = PageRequest.of(i, 5);
			transactionservice.getallTransaction(page);
		}

	}
}
