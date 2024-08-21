import java.util.*;

class Example{
    public static void main(String args[]){
        int arr[] = new int[] {1,2,3,4};
        System.out.println(arr[0]);


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Watermelon");
        System.out.println("ArrayList Elements: " + arrayList);


        Vector<Integer> v = new Vector<>();
        v.addElement(1);
        v.addElement(2);
        System.out.println("Vector Elements: " + v);


        Hashtable<Integer,String> h = new Hashtable<>();
        h.put(1,"Ajoe");
        h.put(2,"Joseph");
        System.out.println("Hashtable Elements: " + h);

        
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
    }
}