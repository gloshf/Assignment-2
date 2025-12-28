import java.io.Serializable;
import java.time.Year;

public abstract class Vehicle implements Servicable {
    protected int id;
    protected static int idGen = 1;
    protected String model;
    protected int year;
    protected double basePrice;

    public Vehicle(String model, int year, double basePrice) {
        this.id = idGen++;
        setModel(model);
        setYear(year);
        setBasePrice(basePrice);
    }

    //getters
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getBasePrice() {
        return basePrice;
    }

    //setters
    public void setModel(String model) {
        this.model = model;
        if(model.isEmpty() || model == null)
            throw new IllegalArgumentException("Model cannot be empty");
    }

    public void setYear(int year) {
        this.year = year;
        int currentYear = Year.now().getValue();
        if(year<1885 ||  year>currentYear)
            throw new IllegalArgumentException("Year must be in reasonable range");
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
        if(basePrice < 0)
            throw new IllegalArgumentException("Base price cannot be negative");
    }


    public int getAge(int currentYear){
        return currentYear - year;
    }

    public abstract double calculateInsuranceFee();

    @Override
    public String toString() {
        return "Vehicle ID: " + id + "\n" +  "Model: " + model + "\n" + "Year: " + year + "\n" + "Base Price: " + "€" + basePrice;
    }


}
