package tibi.sci.rental.domain;

/**
 * Created by Tibi on 5/26/2017.
 */
public class CustomerImp implements Customer {
    public CustomerImp(String aName, int aAge, Address aAddress) {
        name = aName;
        age = aAge;
        address = aAddress;


        if (age < 18) {
            System.out.println("Sorry " +name + ", Car rental not available under 18 -> -> -> -> -> -> -> -> -> -> -> ->");
        } else if (age >= 65) {
            System.out.println("Sorry " +name + ", Can't rent cars for customers over 65 years");
        }else if ((age >= 18) && (age < 65)){
            System.out.println("All good "+name+ ", Let's see what do you need");
        }
    }

    /**
     * 0
     * Formats the person's name and address for mailing.
     * 10
     *
     * @return a string suitable for printing on a mailing label
     * 11
     */
    public String formatForMailing() {
        return name + "\n" + address.format() + "\n" + "Age:" + age;

    }

    private int age;
    private String name;
    private Address address;

}


