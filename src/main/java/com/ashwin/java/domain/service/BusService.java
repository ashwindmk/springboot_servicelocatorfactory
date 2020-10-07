package com.ashwin.java.domain.service;

import org.springframework.stereotype.Service;

@Service("bus")
public class BusService implements VehicleService {
    @Override
    public String process() {
        return "Driving bus";
    }
}
