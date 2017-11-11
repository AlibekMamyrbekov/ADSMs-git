package com.adsms.adsms.controllers;

import com.adsms.adsms.model.*;
import com.adsms.adsms.services.AdministratorService;
import com.adsms.adsms.services.CoordinatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/coordinator")
public class CoordinatorController {
    private CoordinatorService coordinatorService;

    public CoordinatorController(CoordinatorService coordinatorService) {
        this.coordinatorService = coordinatorService;
    }

    @RequestMapping(value = "/createStaff", method = RequestMethod.PUT)
    public void createStaffAndChemists() {
        //todo parse json spring from android

        Staff staff = new Staff();
        staff.setActivity_status(true);
        staff.setDelete_status(false);
        staff.setEmail("asdasd@asdas.dasda");
        staff.setLocation("almaty");
        staff.setName("bozo");
        staff.setPassword("1");
        staff.setPhoneNumber("1");
        staff.setRole("admintest");
        staff.setSurname("test Staff");
        coordinatorService.createStaff(staff);

    }

    //list all staff
    @RequestMapping(value = "/listStaff", method = RequestMethod.GET)
    public ResponseEntity<?> getStaffList() {

        List<Staff> staffs = coordinatorService.ListAllStaff();
        if (staffs == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Staff>>(staffs, HttpStatus.OK);
    }

    //list all patients
    @RequestMapping(value = "/listPatient", method = RequestMethod.GET)
    public ResponseEntity<?> getPatientList() {
        List<Patient> patients = coordinatorService.ListAllPatient();
        if (patients == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Patient>>(patients, HttpStatus.OK);
    }

    public Patient findPatientById(Long patientId){
        Patient patient;
        patient= coordinatorService.findPatientById(patientId);
        return patient;
    }
    public Drug findDrugbyID(Long drugid){
        Drug drug;
        drug=coordinatorService.findDrugById(drugid);
        return drug;
    }

    //list all diagnosys
    @RequestMapping(value = "/listDiagnosys", method = RequestMethod.GET)
    public ResponseEntity<?> getDiagnosys() {

        List<Diagnosis> diagnoses = coordinatorService.ListAllDiagnosys();
        if (diagnoses == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Diagnosis>>(diagnoses, HttpStatus.OK);
    }

    //create patient receipt
    @RequestMapping(value = "/createReceipt", method = RequestMethod.PUT)
    public void setPatientReciept(@RequestParam("patientId") Long patientId,@RequestParam("drugid") Long drugId) {
        Patient patient;
        patient = findPatientById(patientId);
        Drug drug;
        drug=findDrugbyID(drugId);
        Receipt receipt = new Receipt();
        receipt.setDrug(drug);
        receipt.setDrugDoze(100);
        receipt.setPatient(patient);
        receipt.setReceipt_status(true);
        receipt.setRecieptDate(LocalDate.now());
        coordinatorService.createPatientReciept(receipt);
    }
/*
    @RequestMapping(value = "/findByCode", method = RequestMethod.GET)
    public ResponseEntity<?> findtest(@RequestParam("code") String patientId) {
        Patient patient;
        patient= coordinatorService.findPatientByCode(patientId);
        if (patient == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Patient>(patient, HttpStatus.OK);
    }
*/
}
