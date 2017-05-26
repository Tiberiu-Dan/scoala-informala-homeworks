package tibi.sci.rental.domain;

/**
 * Created by Tibi on 5/26/2017.
 */
public class CustomerImp implements Customer {
    public CustomerImp(String aName, int aAge, Address aAddress) {
        name = aName;
        age = aAge;
        address = aAddress;
    }
    /**
     * 09
     * Formats the person's name and address for mailing.
     * 10
     *
     * @return a string suitable for printing on a mailing label
     * 11
     */
    public String formatForMailing() {
        return name + "\n" + address.format()+"\n"+"Age:"+age;
    }
    private int age;
    private String name;
    private Address address;
}


