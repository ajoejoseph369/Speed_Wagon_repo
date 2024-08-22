import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("ArrayList Element at index 1: " + arrayList.get(1));
    }
}
