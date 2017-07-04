package tibi.sci.rental;

import tibi.sci.rental.domain.Car;
import tibi.sci.rental.domain.CustomerImp;

/**
 * Created by Tibi on 5/26/2017.
 */
public class Calendar {

    public void pickupTime(Car car, CustomerImp customerImp,String date){

        System.out.println("Automobilul " + car.getMake() + " " + car.getModel()+ " va fi ridicat de clientul " + customerImp +" la data si ora " + date);
    }




    public void returnTime(){}


}
