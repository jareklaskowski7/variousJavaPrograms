import java.util.LinkedList;
import java.util.List;

public class PrimeNumbers {
    public static List<Integer> generatePrimeNumbers(int[] numbers) {
        List<Integer> primeNumbers = new LinkedList<>();
        for (int number : numbers) {
            if (number > 1) {
                int times = 1;
                for (int someNumber = number - 1; someNumber >= 2; someNumber--)
                    if (times == 1) {
                        if (number % someNumber == 0)
                            times++;
                    } else {
                        break;
                    }
                if (times == 1)
                    primeNumbers.add(number);
            }
        }

        return primeNumbers;
    }

    public static void main(String[] args) {
        int length = 100;
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;
        List<Integer> primeNumbers = generatePrimeNumbers(numbers);
        System.out.println("The prime numbers from " + numbers[0] + " to " + numbers[numbers.length - 1] + " are: ");
        for (int i = 0; i < primeNumbers.size(); i++) {
            System.out.print(primeNumbers.get(i));
            if (i < primeNumbers.size() - 1)
                System.out.print(", ");
            else
                System.out.print(".");
        }
    }
}
