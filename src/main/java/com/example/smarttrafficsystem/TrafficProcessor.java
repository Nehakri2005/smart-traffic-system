package com.example.smarttrafficsystem;  

import java.util.function.Predicate;

public class TrafficProcessor {
    public static Predicate<VehicleEvent> isViolation =
            v -> v.speed > 80 && !v.emergency;
}