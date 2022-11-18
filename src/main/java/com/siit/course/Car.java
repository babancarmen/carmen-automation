package com.siit.course;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;
@Getter
@Setter
public class Car {

    private final float ACC_STEP = 5;
    private CarBrands brand;
    private String model;
    private Color color;
    private String fuelType;
    boolean isNew;
    private String vin;
    private float currentSpeed;

    public Car(CarBrands brand, String model, Color color, String fuelType, boolean isNew, String vin) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.isNew = isNew;
        this.vin = vin;
    }

    public Car() {
        this.color = Color.WHITE;
    }

    public void accelerate() {
        currentSpeed += ACC_STEP;
    }

    public void paintCar(Color color) {
        this.color = color;
    }
}
