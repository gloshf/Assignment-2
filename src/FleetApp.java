import java.util.ArrayList;
import java.util.Scanner;

public class FleetApp {
    private ArrayList<Vehicle> vehicles =  new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void run() {
        boolean loop = true;
        while (loop) {
            printMenu();
            System.out.print("Enter your choice: " + "\n");
            String choice = input.nextLine();

            switch (choice){
                case "1":
                    printAllVehicles();
                    break;

                case "2":
                    addNewCar();
                    break;

                case "3":
                    addNewBus();
                    break;

                case "4":
                    totalInsuranceFee();
                    break;

                case "5":
                    vehicleOlderN();
                    break;

                case "6":
                    performServiceForAll();
                    break;

                case "7":
                    loop = false;
                    break;

            }
        }
        input.close();
    }
    private  void printMenu(){
        System.out.println("Fleet Management System");
        System.out.println("1. Print all vehicles");
        System.out.println("2. Add new car");
        System.out.println("3. Add new bus");
        System.out.println("4. Show total yearly insurance fees");
        System.out.println("5. Show vehicles older than N years");
        System.out.println("6. Perform service for all vehicles");
        System.out.println("7. Quit");
    }

    public void printAllVehicles(){
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the fleet");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.toString() + "\n");
            }
        }
    }

    public void addNewCar(){
        System.out.print("Enter car Model: ");
        String model = input.nextLine();
        System.out.print("Enter car Year: ");
        int year = Integer.parseInt(input.nextLine());
        System.out.print("Enter car Price: ");
        double basePrice = Double.parseDouble(input.nextLine());
        System.out.print("Enter number of doors: ");
        int doors = Integer.parseInt(input.nextLine());

        Vehicle newVehicle = new Car(model, year, basePrice, doors);
        vehicles.add(newVehicle);
    }

    public void addNewBus(){
        System.out.print("Enter bus Model: ");
        String model = input.nextLine();
        System.out.print("Enter bus Year: ");
        int year = Integer.parseInt(input.nextLine());
        System.out.print("Enter bus Price: ");
        double basePrice = Double.parseDouble(input.nextLine());
        System.out.print("Enter number of passengers: ");
        int passengers = Integer.parseInt(input.nextLine());

        Vehicle newVehicle = new Bus(model, year, basePrice, passengers);
        vehicles.add(newVehicle);
    }

    public void totalInsuranceFee(){
        double total = 0;
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the fleet");
        }

        else {
            for (Vehicle vehicle : vehicles) {
                total += vehicle.calculateInsuranceFee();
            }
        }

        System.out.println("Total insurance fees: " + total);
    }

    public void performServiceForAll(){
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the fleet");
        }
        else {
            for (Vehicle vehicle : vehicles) {
                vehicle.performService();
            }
        }
    }

    public void vehicleOlderN(){
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the fleet");
        }
        else {
            int count = 0;
            System.out.print("Enter N: ");
            int N = Integer.parseInt(input.nextLine());
            int currentYear = java.time.Year.now().getValue();

            for (Vehicle vehicle : vehicles) {
                int age = vehicle.getAge(currentYear);
                if(age > N){
                    count++;
                    System.out.println(vehicle);
                }
            }
            System.out.println("Number of Vehicles older than N: " + count);
        }
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}

