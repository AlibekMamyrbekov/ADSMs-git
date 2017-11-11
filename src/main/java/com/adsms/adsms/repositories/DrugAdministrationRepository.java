package com.adsms.adsms.repositories;

import com.adsms.adsms.model.DrugAdministration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrugAdministrationRepository extends CrudRepository<DrugAdministration, Long> {

}
