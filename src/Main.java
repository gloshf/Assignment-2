import java.time.Year;

public class Main {
    public static void main(String[] args) {

        Vehicle car1 = new Car("911 GT3", 2025, 311406, 2);

        System.out.println(car1);

        System.out.println();

        Vehicle bus1 = new Bus("MCI J4500", 2004, 25000, 56);

        System.out.println(bus1);
    }
}
