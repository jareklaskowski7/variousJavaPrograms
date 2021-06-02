import java.util.*;

public class Code3 {
    public static void main(String[] args) {
        // Array is the container in java, which stores the same data type of the elements of fixed size
        // If the size cannot be fixed, or determined, ArrayList and LinkedList are better choices
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++)
            numbers[i] = i;
        for (int number : numbers)
            System.out.println("number : " + number);

        // Map is great if key value pairs are needed
        // Hashtable is synchronized, null keys AND values not allowed
        Map<Integer, String> students = new Hashtable<>();
        students.put(0, "Paul");
        students.put(1, "Lisa");
        students.put(2, "James");
        students.put(3, "Anna");
        //students.put(null, "John"); // not allowed Hashtable, but allowed in Hashmap
        //students.put(4, null); // not allowed Hashtable, but allowed in Hashmap
        //students.put(null, null); not allowed Hashtable, but allowed in Hashmap
        Set<Integer> keys = students.keySet();
        for (Integer key : keys)
            System.out.println("key: " + key + " value: " + students.get(key));
    }
}
