package com.example.demo.service;

import com.example.demo.model.Shipper;
import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ShipperRepo extends CrudRepository<Shipper,Integer> {
    Optional<Shipper> findByShippername(String shippername);
}
