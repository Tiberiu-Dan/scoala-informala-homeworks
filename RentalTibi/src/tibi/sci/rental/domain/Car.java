package tibi.sci.rental.domain;

import tibi.sci.rental.util.FuelType;
import tibi.sci.rental.util.VehiculeCategory;

/**
 * Created by Tibi on 5/25/2017.
 */
public class Car {

    private String make;
    private String model;
    private String color;
    private int seats;
    private int doors;
    private double engine;
    private VehiculeCategory vehiculeCategory;
    private FuelType fuelType;

    public Car(String make, String model, String color, VehiculeCategory vehiculeCategory,FuelType fuelType, int doors, int seats, double engine){
        this.make = make;
        this.model = model;
        this.color = color;
        this.seats = seats;
        this.doors = doors;
        this.engine = engine;
        this.vehiculeCategory = vehiculeCategory;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
    public VehiculeCategory vehiculeCategory(){
        return vehiculeCategory;
    }

    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }

    public double getEngine() {
        return engine;
    }
    public FuelType getFuelType(){
        return fuelType;
    }
}

