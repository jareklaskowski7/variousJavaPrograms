import java.util.*;

public class UniqueNumbersOccurrences {
    public static Map<Integer, Integer> findUniqueNumbersOccurrences(List<Integer> numbers) {
        Map<Integer, Integer> uniqueNumbersOccurrences = new HashMap<>();
        for (Integer number : numbers)
            if (!uniqueNumbersOccurrences.containsKey(number))
                uniqueNumbersOccurrences.put(number, 1);
            else
                uniqueNumbersOccurrences.put(number, uniqueNumbersOccurrences.get(number) + 1);

        return uniqueNumbersOccurrences;
    }

    public static void main(String[] args) {
        //List<Integer> numbers = Arrays.asList(52, 8, 65, 0, 1, 4, -43, 3, 5, 7, 0, 65, -32, 1, 65, 0, -8, 987, 68, 0, 25);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(52, 8, 65, 0, 1, 4, -43, 3, 5, 7, 0, 65, -32, 1, 65, 0, -8, 987, 68, 0, 25));
        Map<Integer, Integer> uniqueNumbersOccurrences = findUniqueNumbersOccurrences(numbers);
        System.out.println("More than one number occurrence:");
        for (Map.Entry<Integer, Integer> entry : uniqueNumbersOccurrences.entrySet())
            if (entry.getValue() > 1)
                System.out.println("Number of occurrences: " + entry.getValue() + " of number " + entry.getKey());
    }
}
