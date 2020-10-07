package com.ashwin.java.domain.service;

import org.springframework.stereotype.Service;

@Service("bike")
public class BikeService implements VehicleService {
    @Override
    public String process() {
        return "Riding bike";
    }
}
