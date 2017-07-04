package tibi.sci.rental.repository;

import tibi.sci.rental.domain.Car;
import tibi.sci.rental.util.FuelType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Tibi on 5/26/2017.
 */
public class CarRepositoryImp implements CarRepository {
    private List<Car> cars = new ArrayList<Car>();


    public List<Car> getAll() {
        return cars;
    }

    public List<Car> getCarsByMake(String make) {
        return null;
    }

    @Override
    public List<Car> getCarsByFuelType(FuelType fuelType) {
        return null;
    }

    public String getCarsByEngine(String color){return color;}

    public void add(Car car) {
        cars.add(car);
    }

    public void delete(Car car) {
        Iterator iterator = cars.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(car)){
                iterator.remove();
            }
        }

    }

    public void update(Car car) {

    }
}
