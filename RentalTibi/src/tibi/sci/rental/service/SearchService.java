package tibi.sci.rental.service;

import tibi.sci.rental.domain.Car;

import java.util.List;

/**
 * Created by Tibi on 5/26/2017.
 */
public interface SearchService {

    List<Car> findCarsByMake(String make);

    List<Car> findCarsByMakeAndModel(String make, String model);

    List<Car> findCarsByMultipleCategories(String make, String model, String color,int seats,int doors);
}
