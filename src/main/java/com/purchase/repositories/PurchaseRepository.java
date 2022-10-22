package com.purchase.repositories;

import com.purchase.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @Query(value = "SELECT * FROM purchase WHERE expires > CURDATE()", nativeQuery = true)
    List<Purchase> findAllValidPurchases();

}
