package com.klef.ms.sem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.ms.sem.entity.Inventory;
import com.klef.ms.sem.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
@CrossOrigin
public class InventoryController {

    @Autowired
    private InventoryService service;

    // Add Inventory
    @PostMapping("/add")
    public Inventory addInventory(@RequestBody Inventory inventory) {
        return service.addInventory(inventory);
    }

    // View All Inventory
    @GetMapping("/all")
    public List<Inventory> getAllInventory() {
        return service.getAllInventory();
    }

    // View Inventory By ID
    @GetMapping("/{id}")
    public ResponseEntity<Inventory> getInventoryById(@PathVariable Long id) {

        return service.getInventoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}