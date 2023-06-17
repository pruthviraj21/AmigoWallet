package com.infy.amigoWallet.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.amigoWallet.dto.CustomerDTO;
import com.infy.amigoWallet.dto.LoginDTO;
import com.infy.amigoWallet.entity.Account;
import com.infy.amigoWallet.entity.Customer;
import com.infy.amigoWallet.repository.AccountRepository;
import com.infy.amigoWallet.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository custRepo;
	@Autowired
	private AccountRepository accRepo;

	@Override
	public CustomerDTO addCustomer(CustomerDTO customerdto) {
		custRepo.save(customerdto.createCustomerEntity(customerdto));
		return customerdto;
	}

	@Override
	public boolean login(LoginDTO loginDTO) {
		Boolean flag = false;

		Optional<Customer> cust;
		cust = custRepo.findByphoneno(loginDTO.getPhoneNo());
		if (cust.isPresent() && cust.get() != null && cust.get().getPassword().equals(loginDTO.getPassword())) {
			flag = true;
		}
		return flag;
	}

	@Override
	public String transferUsertoUser(String senderEmail, String receiverEmail, double amount) throws Exception {

		Optional<Customer> customer = custRepo.findByemailId(senderEmail);
		Optional<Customer> customer1 = custRepo.findByemailId(receiverEmail);
		if (customer.isEmpty() || customer1.isEmpty())
			throw new Exception("Invalid Emailid");
		if (amount > customer.get().getWalletbalance())
			throw new Exception("Wallet balance not Sufficient");

		customer.get().setWalletbalance(customer.get().getWalletbalance() - amount);
		customer1.get().setWalletbalance(customer1.get().getWalletbalance() + amount);
		custRepo.save(customer.get());
		custRepo.save(customer1.get());
		return "amount transfered successfully";
	}

	@Override
	public String transferUsertoAccount(String emailid, long accountno, double amount) throws Exception {
		Optional<Customer> customer = custRepo.findById(emailid);
		Optional<Account> acc = accRepo.findById(accountno);
		if (customer.isEmpty() || acc.isEmpty())
			throw new Exception("Invalid Emailid or Account");
		if (amount > customer.get().getWalletbalance())
			throw new Exception("Wallet balance not Sufficient");	
			customer.get().setWalletbalance(customer.get().getWalletbalance() - amount);
			acc.get().setBalance(acc.get().getBalance() + amount);
			custRepo.save(customer.get());
			accRepo.save(acc.get());
		return "Amount tranfered to account successfully";
	}

	@Override
	public String transferAcounttoUser(long accountno, String emailid, double amount) throws Exception {
		Optional<Customer> customer = custRepo.findById(emailid);
		Optional<Account> acc = accRepo.findById(accountno);
		if (customer.isEmpty() || acc.isEmpty())
			throw new Exception("Invalid Emailid or Account");
		if (amount > acc.get().getBalance())
			throw new Exception("Wallet balance not Sufficient");
			acc.get().setBalance(acc.get().getBalance() - amount);
			customer.get().setWalletbalance(customer.get().getWalletbalance() + amount);
			custRepo.save(customer.get());
			accRepo.save(acc.get());
		return "Wallet topup done!!";
		
	}

}
