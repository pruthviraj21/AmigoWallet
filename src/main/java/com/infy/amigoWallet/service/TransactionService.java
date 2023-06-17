package com.infy.amigoWallet.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.infy.amigoWallet.dto.TransactionDTO;
import com.infy.amigoWallet.entity.Transaction;

public interface TransactionService {
	public void insertTransactions(TransactionDTO transactiondto);
    public Page<Transaction> getallTransaction(Pageable page);
}
