package com.adsms.adsms.services;

import com.adsms.adsms.model.Diagnosis;
import com.adsms.adsms.model.Patient;
import com.adsms.adsms.model.Research;
import com.adsms.adsms.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AdministratorService {

    private PatientRepository patientRepository;
    private DiagnosysRepository diagnosysRepository;
    private EventRepository eventRepository;
    private EventPrototypeRepository eventPrototypeRepository;
    private TaskRepository taskRepository;
    private TaskPrototypeRepository taskPrototypeRepository;
    private ResearchRepository researchRepository;

    private static final Logger LOG = LoggerFactory.getLogger(AdministratorService.class);
    private static final int COMPLETE = 100;
    private static final double INCOMPLETE_DOUBLE = 0;
    private static final int INCOMPLETE = 0;
    private static final double ALL_TASKS = 341.0;
    private static final int PERCENT = 100;

    public AdministratorService(PatientRepository patientRepository, DiagnosysRepository diagnosysRepository,
                                EventRepository eventRepository, EventPrototypeRepository eventPrototypeRepository,
                                TaskRepository taskRepository, TaskPrototypeRepository taskPrototypeRepository,
                                ResearchRepository researchRepository) {
        this.patientRepository = patientRepository;
        this.diagnosysRepository = diagnosysRepository;
        this.eventRepository = eventRepository;
        this.eventPrototypeRepository = eventPrototypeRepository;
        this.taskRepository = taskRepository;
        this.taskPrototypeRepository = taskPrototypeRepository;
        this.researchRepository = researchRepository;
    }

    public void createPatientAndDiagnosys (Patient patient, Diagnosis diagnosys){
        patientRepository.save(patient);
        diagnosysRepository.save(diagnosys);
    }

    public void createResearch(Research research){
        researchRepository.save(research);


    }
}
