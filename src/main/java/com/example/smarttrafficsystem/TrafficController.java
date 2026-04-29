package com.example.smarttrafficsystem;  

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TrafficController {

    @PostMapping("/check")
    public String check(@RequestBody VehicleEvent v) {

        if (TrafficProcessor.isViolation.test(v)) {
            int fine = (v.speed - 80) * 100;
            return "Violation | Fine: ₹" + fine;
        } else {
            return "No violation";
        }
    }
}