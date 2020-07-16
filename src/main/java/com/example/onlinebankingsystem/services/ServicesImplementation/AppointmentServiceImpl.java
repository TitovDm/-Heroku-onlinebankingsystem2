package com.example.onlinebankingsystem.services.ServicesImplementation;

import com.example.onlinebankingsystem.models.Appointment;
import com.example.onlinebankingsystem.repository.AppointmentRepository;
import com.example.onlinebankingsystem.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }

    @Override
    public Optional<Appointment> findAppointment(Long id) {
        return appointmentRepository.findById(id);
    }
}