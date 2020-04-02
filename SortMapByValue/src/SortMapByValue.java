// Sort or order a HashMap or TreeSet or any map item by value.
// Write a comparator which compares by value, not by key.
// Entry class might help you here.

import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        Beatle b1 = new Beatle(7, "Ringo");
        Beatle b2 = new Beatle(4, "Paul");
        Beatle b3 = new Beatle(8, "George");
        Beatle b4 = new Beatle(6, "Brian");
        Beatle b5 = new Beatle(5, "John");

        Map<Long, String> numbersNames = new HashMap<>();
        numbersNames.put(b1.getId(), b1.getFirstName());
        numbersNames.put(b2.getId(), b2.getFirstName());
        numbersNames.put(b3.getId(), b3.getFirstName());
        numbersNames.put(b4.getId(), b4.getFirstName());
        numbersNames.put(b5.getId(), b5.getFirstName());

        System.out.println("Unsorted:");
        List<String> firstNames = new ArrayList<>(numbersNames.values());
        for (String firstName : firstNames)
            System.out.println("firstName == " + firstName);

        System.out.println("Sorted:");
        Collections.sort(firstNames);
        for (String firstName : firstNames)
            System.out.println("firstName == " + firstName);

        Map<Long, String> numbersNamesSorted = new LinkedHashMap<>();
        for (String firstName : firstNames)
            for (Map.Entry<Long, String> entry : numbersNames.entrySet())
                if (firstName.equals(entry.getValue()))
                    numbersNamesSorted.put(entry.getKey(), entry.getValue());

        for (Map.Entry<Long, String> entry : numbersNamesSorted.entrySet())
            System.out.println(entry.getKey() + ", " + entry.getValue());
    }
}
