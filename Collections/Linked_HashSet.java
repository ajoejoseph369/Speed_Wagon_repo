import java.util.*;

public class Linked_HashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        linkedHashSet.add("Red");  // Duplicate element (won't be added)

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
