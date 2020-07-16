package com.example.onlinebankingsystem.repository;

import com.example.onlinebankingsystem.models.SavingsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsTransactionRepository  extends JpaRepository<SavingsTransaction,Long> {

}