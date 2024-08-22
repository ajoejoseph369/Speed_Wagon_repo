import java.util.*;

public class Vectors {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Car");
        vector.add("Bike");
        vector.add("Bus");

        System.out.println("Vector: " + vector);
        System.out.println("Vector Element at index 2: " + vector.get(2));
    }
}
