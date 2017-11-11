package com.adsms.adsms.repositories;

import com.adsms.adsms.model.Receipt;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepository extends CrudRepository<Receipt,Long> {
}
