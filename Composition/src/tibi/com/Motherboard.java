package tibi.com;

/**
 * Created by Tibi on 6/21/2017.
 */
public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String nameBios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String nameBios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.nameBios = nameBios;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getNameBios() {
        return nameBios;
    }
    public void loadProgram(String programName){
        System.out.println(programName +" is now loading...");
    }
}
