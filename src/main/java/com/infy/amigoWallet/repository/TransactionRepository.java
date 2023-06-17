package com.infy.amigoWallet.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.infy.amigoWallet.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

	
}
