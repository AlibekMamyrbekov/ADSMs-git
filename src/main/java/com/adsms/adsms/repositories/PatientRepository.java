package com.adsms.adsms.repositories;

import com.adsms.adsms.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

List<Patient> findAllPatientsByDoctor_Id(Long doctorId);

Patient findByPatientId(Long patientCode);
}
