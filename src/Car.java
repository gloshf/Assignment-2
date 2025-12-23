/*public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        setNumberOfDoors(numberOfDoors);
    }

    public void getNumberOfDoors(int numberOfDoors) {
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
        return super.toString() +
                "numberOfDoors=" + numberOfDoors;
    }
}

 */