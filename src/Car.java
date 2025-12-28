public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        int age = getAge(java.time.Year.now().getValue());
        return getBasePrice() * 0.05 + age * 100;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber Of Doors: " + numberOfDoors;
    }

    @Override
    public void performService(){
        System.out.println("Car services: oil, filters, and inspections");
    }

    @Override
    public int getServiceIntervalKm() {
        return 15000;
    }



}