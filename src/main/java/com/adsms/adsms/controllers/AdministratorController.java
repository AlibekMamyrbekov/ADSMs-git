package com.adsms.adsms.controllers;

import com.adsms.adsms.model.Diagnosis;
import com.adsms.adsms.model.Patient;
import com.adsms.adsms.model.Research;
import com.adsms.adsms.model.Staff;
import com.adsms.adsms.services.AdministratorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Date;
import java.time.LocalDate;


@RestController
@RequestMapping("/api/admin")
public class AdministratorController {
    private AdministratorService administratorService;

    public AdministratorController(AdministratorService administratorService) {
        this.administratorService = administratorService;
    }

    @RequestMapping(value = "/createPatient", method = RequestMethod.PUT)
    public void createPatient() {
        //todo parse json spring from android

        Patient patient = new Patient();
        patient.setPatientCode("kaz-test-001");
        patient.setConfirmed(true);
        patient.setDateOfBirthday(Date.valueOf("2017-10-10"));
        patient.setEmail("asd");
        patient.setInitials("PPP");
        patient.setPassword("asd");
        patient.setPatientSex("male");
        patient.setPhoneNumber("8777");
        patient.setPatinent_diagnosis(new Diagnosis());
        patient.setDoctor(new Staff());

        administratorService.createPatientAndDiagnosys(patient, new Diagnosis());

        Research research = new Research();
        research.setActivationDate(LocalDate.now());
        research.setActivationStatus(true);
        research.setEnrollmentDate(LocalDate.now());
        research.setPatient(patient);
        research.setResearchProgress(0);

    //    administratorService.createResearch(research);


    }
}
