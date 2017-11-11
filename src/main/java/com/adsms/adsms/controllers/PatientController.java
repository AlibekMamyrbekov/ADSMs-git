package com.adsms.adsms.controllers;

import com.adsms.adsms.model.*;
import com.adsms.adsms.repositories.TaskPrototypeRepository;
import com.adsms.adsms.services.ChemistService;
import com.adsms.adsms.services.PatientService;
import com.adsms.adsms.services.StaffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PatientController {

    private PatientService patientService;
    private ChemistService chemistService;
    private TaskPrototypeRepository taskPrototypeRepository;
    private StaffService staffService;

    public PatientController(PatientService patientService, ChemistService chemistService,
                             TaskPrototypeRepository taskPrototypeRepository, StaffService staffService) {
        this.patientService = patientService;
        this.chemistService = chemistService;
        this.taskPrototypeRepository = taskPrototypeRepository;
        this.staffService = staffService;
    }

    @RequestMapping(value = "addtask", method = RequestMethod.PUT)
    public TaskPrototype addTask(@RequestParam("nameTask") String name) {
        System.out.println("ok__________________");
        TaskPrototype taskPrototype = new TaskPrototype();
        taskPrototype.setName(name);
        taskPrototype.setTaskDescription("boko");
        System.out.println(taskPrototype.getName().toString());
        staffService.addTaskPrototype(taskPrototype);
        return taskPrototype;
    }
    @RequestMapping(value = "viewtask/", method = RequestMethod.GET)
    public ResponseEntity<?> getTask(@PathVariable("id") long id) {

        List<TaskPrototype> taskPrototypes = staffService.listAll();
        if (taskPrototypes == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<TaskPrototype>>(taskPrototypes, HttpStatus.OK);
    }

    @RequestMapping(value = "patients/", method = RequestMethod.GET)
    public ResponseEntity<?> getUser() {

        List<Patient> patients = patientService.listAll();
        if (patients == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Patient>>(patients, HttpStatus.OK);
    }


    @RequestMapping("/")
    public String redirToList() {
        return "redirect:/api/";
    }


}
