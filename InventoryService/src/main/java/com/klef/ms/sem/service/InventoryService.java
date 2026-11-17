package com.klef.ms.sem.service;

import java.util.List;
import java.util.Optional;

import com.klef.ms.sem.entity.Inventory;

public interface InventoryService {

    Inventory addInventory(Inventory inventory);

    List<Inventory> getAllInventory();

    Optional<Inventory> getInventoryById(Long id);
}