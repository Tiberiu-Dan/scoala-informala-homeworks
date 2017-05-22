package ro.sci.cars;

import ro.sci.cars.util.FuelType;

/**
 * Created by tibi on 5/11/17.
 */
public class Car implements Vehicle {












    private double fuelTankSize;
    private int gears;
    private double availableFuel;
    private FuelType fuelType;
    private double factoryAvgConsumptionPer100km;
    private double driveAvgConsumptionPer100km;
    private int currentGear;
    private double[] consumptionPerGearPer100Km = {30d, 26d, 20d, 16d, 12d, 7d};
    private double distance;
    private double fuelOnStart;


    public Car(double fuel, FuelType fuelType, int fuelTankSize, int gears, double avgConsumption) {
        this.availableFuel = fuel;
        this.fuelOnStart = fuel;
        this.fuelType = fuelType;
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;
        this.factoryAvgConsumptionPer100km = avgConsumption;


    }

    public void start() {
        System.out.println("Start the Car");
    }

    public void stop() {
        System.out.println("Stop the car");
    }

    public double calculateFuel(int currentGear, double km) {
        this.driveAvgConsumptionPer100km = (consumptionPerGearPer100Km[this.currentGear - 1] * km) / 100;
        this.availableFuel -= this.driveAvgConsumptionPer100km;
        return 1;
    }


    public void drive(double km) {
        System.out.println("drive " + km);

        switch (this.currentGear) {
            case 1: {
                calculateFuel(1, 0.1);
                distance =distance+ km;
                break;
            }
            case 2: {
                calculateFuel(2, 0.4);
                distance =distance+ km;
                break;
            }
            case 3: {
                calculateFuel(3, 1);
                distance =distance+ km;
                break;
            }
            case 4: {
                calculateFuel(4, 7);
                distance =distance+ km;
                break;
            }
            case 5: {
                calculateFuel(5, 48);
                distance =distance+km;
                break;
            }
            case 6: {
                calculateFuel(6, 110);
                distance =distance+ km;
                break;
            }

        }

    }

    public void shitGear(int gear) {
        System.out.println("shitGear " + gear);
        this.currentGear = gear;
    }

    public double getAvailableFuel() {
        if (this.availableFuel <= 10) {
            System.out.println("Car needs fuel!");
        } else if (this.availableFuel >= 20)
            System.out.println("Enjoy,you have enough fuel for another road");
        return this.availableFuel;
    }


    public double getAvgFuelPer100km() {
        return ((this.fuelOnStart - this.availableFuel) * 100 / this.distance);
    }

    public FuelType getFuelType() {
        return this.fuelType;


    }
}
