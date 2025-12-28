public class Bus extends Vehicle {
    private int passengerCapacity;

    public  Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        setPassengerCapacity(passengerCapacity);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee(){
        int age = java.time.Year.now().getValue();
        return basePrice * 0.08 + passengerCapacity * 50 + age * 150;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPassenger Capacity: " + passengerCapacity;
    }
}
