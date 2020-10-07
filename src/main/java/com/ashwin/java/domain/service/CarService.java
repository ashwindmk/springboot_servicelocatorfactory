package com.ashwin.java.domain.service;

import org.springframework.stereotype.Service;

@Service("car")
public class CarService implements VehicleService {
    @Override
    public String process() {
        return "Driving car";
    }
}
