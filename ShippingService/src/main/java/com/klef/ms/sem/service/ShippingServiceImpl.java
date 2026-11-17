package com.klef.ms.sem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.ms.sem.entity.Shipping;
import com.klef.ms.sem.repository.ShippingRepository;

@Service
public class ShippingServiceImpl implements ShippingService {

    @Autowired
    private ShippingRepository repository;

    @Override
    public Shipping addShipping(Shipping shipping) {
        return repository.save(shipping);
    }

    @Override
    public List<Shipping> getAllShipping() {
        return repository.findAll();
    }

    @Override
    public Optional<Shipping> getShippingById(Long id) {
        return repository.findById(id);
    }
}
