package com.example.onlinebankingsystem.repository;

import com.example.onlinebankingsystem.models.PrimaryTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryTransactionRepository extends JpaRepository<PrimaryTransaction,Long> {
}