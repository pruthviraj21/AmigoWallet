package com.infy.amigoWallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.amigoWallet.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
