package com.example.onlinebankingsystem.repository;

import com.example.onlinebankingsystem.models.PrimaryAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryAccountRepository extends JpaRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);

}
