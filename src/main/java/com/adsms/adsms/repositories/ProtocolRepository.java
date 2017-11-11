package com.adsms.adsms.repositories;

import com.adsms.adsms.model.Protocol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocolRepository extends CrudRepository<Protocol,Long> {
}
