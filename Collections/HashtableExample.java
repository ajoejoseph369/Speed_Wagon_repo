import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "HTML");
        hashtable.put(2, "CSS");
        hashtable.put(3, "JavaScript");

        System.out.println("Hashtable: " + hashtable);
    }
}
