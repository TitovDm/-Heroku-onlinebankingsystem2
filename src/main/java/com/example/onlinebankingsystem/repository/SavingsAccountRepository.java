package com.example.onlinebankingsystem.repository;

import com.example.onlinebankingsystem.models.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount,Long> {
    SavingsAccount findByAccountNumber (int accountNumber);
}