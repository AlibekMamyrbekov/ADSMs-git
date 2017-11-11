package com.adsms.adsms.controllers;

import com.adsms.adsms.model.Patient;
import com.adsms.adsms.model.Staff;
import com.adsms.adsms.services.DoctorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @RequestMapping(value = "/listMyPatients", method = RequestMethod.GET)
    public ResponseEntity<?> getDoctorPatients(@RequestParam("id") Long id) {
        Patient patients = doctorService.listMyPatient(id);
        if (patients == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Patient>(patients, HttpStatus.OK);
    }
}
