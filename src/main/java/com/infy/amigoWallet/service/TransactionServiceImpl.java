package com.infy.amigoWallet.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.infy.amigoWallet.dto.TransactionDTO;
import com.infy.amigoWallet.entity.Transaction;
import com.infy.amigoWallet.repository.TransactionRepository;
@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
	TransactionRepository transactionrepo;
	
	
	@Override
	public void insertTransactions(TransactionDTO transactiondto) {
		transactionrepo.save(transactiondto.createTarnsctionEntity(transactiondto));
		
	}

	
	@Override
	public Page<Transaction> getallTransaction(Pageable page)  {
		
		return transactionrepo.findAll(page);
		
	}

}
