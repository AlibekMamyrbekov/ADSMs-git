package com.adsms.adsms.services;

import com.adsms.adsms.model.*;
import com.adsms.adsms.repositories.*;
import org.hibernate.sql.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.management.Query;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class StaffService {

    private TaskPrototypeRepository taskPrototypeRepository;


    public StaffService(TaskPrototypeRepository taskPrototypeRepository){
        this.taskPrototypeRepository = taskPrototypeRepository;
    }



    public TaskPrototype addTaskPrototype(TaskPrototype taskPrototype) {
        taskPrototypeRepository.save(taskPrototype);
        return taskPrototype;
    }
    public List<TaskPrototype> listAll() {
        List<TaskPrototype> taskPrototypes = new ArrayList<>();
        taskPrototypeRepository.findAll().forEach(taskPrototypes::add);
        System.out.println(taskPrototypes + "______________");
        return taskPrototypes;
    }

}
