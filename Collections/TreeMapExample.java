import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Ruby");
        treeMap.put(1, "JavaScript");
        treeMap.put(2, "Kotlin");

        System.out.println("TreeMap: " + treeMap);
    }
}
