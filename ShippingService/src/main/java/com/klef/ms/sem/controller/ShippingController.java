package com.klef.ms.sem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.ms.sem.entity.Shipping;
import com.klef.ms.sem.service.ShippingService;

@RestController
@RequestMapping("/api/shipping")
@CrossOrigin
public class ShippingController {

    @Autowired
    private ShippingService service;

    @PostMapping("/add")
    public Shipping addShipping(@RequestBody Shipping shipping) {
        return service.addShipping(shipping);
    }

    @GetMapping("/all")
    public List<Shipping> getAllShipping() {
        return service.getAllShipping();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shipping> getShippingById(@PathVariable Long id) {
        return service.getShippingById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
