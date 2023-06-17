package com.infy.amigoWallet.service;

import com.infy.amigoWallet.dto.CustomerDTO;
import com.infy.amigoWallet.dto.LoginDTO;

public interface CustomerService {
public String transferUsertoUser (String senderEmail,String receiverEmail,double amount)throws Exception;
public String transferUsertoAccount(String emailid,long accountno,double amount) throws Exception;
public String transferAcounttoUser(long accountno,String emailid,double amount) throws Exception;
public boolean login(LoginDTO loginDTO);
public CustomerDTO addCustomer(CustomerDTO customerdto);
}
