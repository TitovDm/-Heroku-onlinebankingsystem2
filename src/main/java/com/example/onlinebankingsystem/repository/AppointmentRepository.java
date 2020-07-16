package com.example.onlinebankingsystem.repository;

import com.example.onlinebankingsystem.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

}