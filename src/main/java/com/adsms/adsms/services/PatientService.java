package com.adsms.adsms.services;

import com.adsms.adsms.model.*;
import com.adsms.adsms.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PatientService {

    public PatientService(PatientRepository patientRepository, StaffRepository staffRepository, TaskPrototypeRepository taskPrototypeRepository) {
        this.patientRepository = patientRepository;
        this.staffRepository = staffRepository;
        this.taskPrototypeRepository = taskPrototypeRepository;
    }

    private PatientRepository patientRepository;
    private StaffRepository staffRepository;
    private TaskPrototypeRepository taskPrototypeRepository;


    // Show all patients
    public List<Patient> listAll() {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll().forEach(patients::add);
        System.out.println(patients + "______________");
        return patients;
    }

}
