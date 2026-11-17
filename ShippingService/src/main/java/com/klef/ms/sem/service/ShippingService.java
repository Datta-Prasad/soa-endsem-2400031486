package com.klef.ms.sem.service;

import java.util.List;
import java.util.Optional;

import com.klef.ms.sem.entity.Shipping;

public interface ShippingService {

    Shipping addShipping(Shipping shipping);

    List<Shipping> getAllShipping();

    Optional<Shipping> getShippingById(Long id);
}
