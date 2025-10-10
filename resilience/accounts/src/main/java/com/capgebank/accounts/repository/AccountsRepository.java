package com.capgebank.accounts.repository;

import com.capgebank.accounts.model.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Account, Long> {

   Optional<Account> findByCustomerId(long customerId);

   @Transactional
   @Modifying
   void deleteByCustomerId(Long customerId);
}
