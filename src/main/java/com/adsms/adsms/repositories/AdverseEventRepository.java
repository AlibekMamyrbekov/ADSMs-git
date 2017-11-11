package com.adsms.adsms.repositories;

import com.adsms.adsms.model.AdverseEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdverseEventRepository extends CrudRepository<AdverseEvent,Long>{

}
