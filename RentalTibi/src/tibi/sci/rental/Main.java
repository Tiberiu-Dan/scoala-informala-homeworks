package tibi.sci.rental;

import tibi.sci.rental.domain.Car;
import tibi.sci.rental.domain.CustomerImp;
import tibi.sci.rental.repository.CarRepository;
import tibi.sci.rental.repository.CarRepositoryImp;
import tibi.sci.rental.service.SearchServiceImp;
import tibi.sci.rental.util.FuelType;
import tibi.sci.rental.util.VehiculeCategory;
import tibi.sci.rental.domain.Address;



import java.util.List;

public class Main {

    public static void main(String[] args) {
        Car Dacia = new Car("Dacia", "Duster", "Black", VehiculeCategory.SUV, FuelType.DIESEL, 4, 5, 2d);
        Car Opel = new Car("Opel", "ASTRA GTC", "Yellow", VehiculeCategory.COUOE, FuelType.DIESEL, 2, 5, 1.7d);
        Car Renault = new Car("Renault", "Future", "White", VehiculeCategory.COUOE, FuelType.HYBRID, 2, 2, 1d);


        CarRepositoryImp carRepository = new CarRepositoryImp();
        //Add cars to the repository
        carRepository.add(Dacia);
        carRepository.add(Opel);
        carRepository.add(Renault);
        carRepository.delete(Dacia);


       /* CustomerImp andrei = new CustomerImp("Andrei",16,new Address("Mehedinti","Cluj-Napoca","Cluj-Napoca","403132"));
        System.out.println(andrei.formatForMailing());*/
        CustomerImp tibi = new CustomerImp("Tibi",24,new Address("Calea Floresti","Cluj-Napoca","RO","400333"));
        System.out.println(tibi.formatForMailing());

      //  CustomerImp dan = new CustomerImp("Dan",76,new Address("Principala","Iara","Cluj","401315"));
      //  System.out.println((dan.formatForMailing()));


        search(carRepository);

    }

    private static void search(CarRepository carRepository) {
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("List of all cars from repository : ");
        for (Car car : carRepository.getAll()) {
            System.out.println(car.getMake());

        }
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        SearchServiceImp searchModel_1_ = new SearchServiceImp((CarRepositoryImp) carRepository);
        List<Car> foundCarsByMake = searchModel_1_.findCarsByMake("Opel");
        for (Car car : foundCarsByMake) {
            System.out.println("List of cars by make: " +" \n"+ car.getMake());
        }
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        SearchServiceImp serchModel_2_ = new SearchServiceImp((CarRepositoryImp) carRepository);
        List<Car> foundCarsByMakeAndModel = serchModel_2_.findCarsByMakeAndModel("Renault", "Future");
        for (Car car : foundCarsByMakeAndModel) {
            System.out.println("Car make is " + car.getMake() + " and model is " + car.getModel());
        }
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        SearchServiceImp searchModel_3_ = new SearchServiceImp((CarRepositoryImp) carRepository);
        List<Car> foundCarsByMultipleCategories = searchModel_3_.findCarsByMultipleCategories("Opel","Astra GTC","Yellow",5,2);
        for (Car car:foundCarsByMultipleCategories){
            System.out.println(car.getMake()+", "+car.getModel()+" ,"+car.getColor()+ " ,numb. of seats: " +car.getSeats()+" doors: "+car.getDoors());
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


        }
    }

    }
