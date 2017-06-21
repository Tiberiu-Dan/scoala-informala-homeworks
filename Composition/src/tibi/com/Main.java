package tibi.com;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2208","Dell","240",dimensions);
        Monitor monitor = new Monitor("27 inch Beast","Asus",27,new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("Strix","Asus",4,4,"v2.44");

        PC thePC = new PC(theCase,monitor,motherboard);

        thePC.powerUp();

    }


}
