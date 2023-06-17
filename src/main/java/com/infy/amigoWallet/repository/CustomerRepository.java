package com.infy.amigoWallet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.amigoWallet.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

	

	Optional<Customer> findByemailId(String receiverEmail);

	Optional<Customer> findByphoneno(long phoneNo);

}
