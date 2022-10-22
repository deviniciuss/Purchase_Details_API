package com.purchase.service;

import com.purchase.model.Purchase;
import com.purchase.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository repository;

    public Purchase find(Long id){
        return repository.findById(id).orElse(null);
    }
    public List<Purchase> findAll(){return repository.findAllValidPurchases();}

    public Purchase add(Purchase purchase){return repository.save(purchase);}

}
