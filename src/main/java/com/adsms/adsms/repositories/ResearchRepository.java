package com.adsms.adsms.repositories;

import com.adsms.adsms.model.Research;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearchRepository extends CrudRepository<Research,Long> {
}
