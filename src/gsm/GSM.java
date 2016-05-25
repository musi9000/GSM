package gsm;

import java.util.ArrayList;


/**
 *
 * @author mustafa
 */
public class GSM {

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static String getN95() {
        return n95;
    }

    private String model;
    private String brand;
    private double price;
    private String owner;
    static String n95 = "Nokia n95";
    static int phoneCount = 0;
    private ArrayList<Call> callHistory = new ArrayList<Call>();

    public GSM(String gsmModel, String gsmBrand, double gsmPrice, String gsmOwner) {
        this.model = gsmModel;
        this.brand = gsmBrand;
        this.price = gsmPrice;
        this.owner = gsmOwner;
        phoneCount++;
    }

    public GSM(String gsmModel, String gsmBrand) {
        this.model = gsmModel;
        this.brand = gsmBrand;
        this.price = 0;
        this.owner = null;
        phoneCount++;
    }

    public void printInfo() {
        System.out.printf("Model %s brand %s price %.2f owner %s\n", model, brand, price, owner);
    }

    public void addCall(String date, String startTime, int duration) {
       
        callHistory.add(new Call(date, startTime, duration));

    }
    
    public void clearCallHistory(){
        callHistory.clear();
    }
    
    public void removeCall(int index){
        callHistory.remove(index);
    }

    public void calculateCalls(double price){
        int callsDuration = 0;
        
        for (int i = 0; i < callHistory.size(); i++) {
            callsDuration += callHistory.get(i).getDuration();
        }
        
        System.out.println(callsDuration * price);
    }
    
    public void printCallHistory() {
        for (int i = 0; i < callHistory.size(); i++) {
            System.out.printf("Date : %s ", callHistory.get(i).getDate());
            System.out.printf("start time : %s ", callHistory.get(i).getStartTime());
            System.out.printf("duration : %d\n", callHistory.get(i).getDuration());
        }

    }
}
