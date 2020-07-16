package com.example.onlinebankingsystem.services;

import com.example.onlinebankingsystem.models.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {

    Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Optional<Appointment> findAppointment(Long id);

}