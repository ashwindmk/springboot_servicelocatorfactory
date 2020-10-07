package com.ashwin.java.api.controller;

import com.ashwin.java.domain.service.ServiceRegistry;
import com.ashwin.java.domain.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private ServiceRegistry serviceRegistry;

    @GetMapping
    @RequestMapping("/{vehicle}/ride")
    public ResponseEntity<String> ride(@PathVariable String vehicle) {
        VehicleService vehicleService = serviceRegistry.getService(vehicle);
        String res = vehicleService.process();
        return ResponseEntity.ok(res);
    }
}
