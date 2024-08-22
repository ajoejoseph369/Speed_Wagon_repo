import java.util.*;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Horse");

        System.out.println("LinkedList: " + linkedList);
        System.out.println("LinkedList Element at index 0: " + linkedList.get(0));
    }
}
