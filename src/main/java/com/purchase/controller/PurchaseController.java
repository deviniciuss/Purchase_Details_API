package com.purchase.controller;

import com.purchase.model.Purchase;
import com.purchase.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "api/purchase")
public class PurchaseController {


    @Autowired
    private PurchaseService service;


    @GetMapping("/{id}")
    public Purchase find(@PathVariable Long id){
        return service.find(id);
    }

    @GetMapping("")
    public List<Purchase> findAll(){return service.findAll();}

    @PostMapping("/add")
    public Purchase add(@RequestBody Purchase purchase){ return service.add(purchase);}
}
