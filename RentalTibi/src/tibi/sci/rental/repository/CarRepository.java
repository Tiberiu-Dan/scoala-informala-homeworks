package tibi.sci.rental.repository;

import tibi.sci.rental.domain.Car;
import tibi.sci.rental.util.FuelType;

import java.util.List;

/**
 * Created by Tibi on 5/26/2017.
 */
public interface CarRepository {

        /**
         * Get all cars in the system
         * @return List<Car>
         */
        List<Car> getAll();

        /**
         * Return all the cars of a certain maker
         * @param make
         * @return List<Car>
         */
        List<Car> getCarsByMake(String make);

        /**
         * Return all cars by fuel type
         * @param fuelType
         * @return List<Car>
         */
        List<Car> getCarsByFuelType(FuelType fuelType);

        /**
         * Add a car in the system.
         * @param car
         */
        void add(Car car);

        /**
         * Delete a car from the system.
         * @param car
         */
        void delete(Car car);

        /**
         * Updates car information in the system.
         * @param car
         */
        void update(Car car);
}
