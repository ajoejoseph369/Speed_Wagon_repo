import java.util.*;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple");  // Duplicate element (won't be added)

        System.out.println("HashSet: " + hashSet);
    }
}
