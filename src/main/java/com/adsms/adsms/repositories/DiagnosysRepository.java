package com.adsms.adsms.repositories;

import com.adsms.adsms.model.Diagnosis;
import com.adsms.adsms.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DiagnosysRepository extends CrudRepository<Diagnosis,Long> {

}
