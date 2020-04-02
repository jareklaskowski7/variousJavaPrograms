import java.util.Scanner;

public class FactorialNumberRegArray {
    private static int number;

    public static void setNumber(int number) {
        FactorialNumberRegArray.number = number;
    }

    public static long calculateFactorialNumber(int number) {
        int[] numbers = new int[number];
        long factorialNumber = 1;

        for (int idx = 0; idx < numbers.length; idx++)
            numbers[idx] = idx + 1;

        /*
        while (number > 0) {
            number--;
            numbers[number] = number + 1;
        }
        */

        for (int oneNumber : numbers)
            factorialNumber *= oneNumber;
        return factorialNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the positive number: ");
        setNumber(scan.nextInt());
        if (number >= 0)
            System.out.println("The factorial number of " + number + " is: " + calculateFactorialNumber(number) + ".");
        else
            System.out.println("Please enter the positive number!");
        scan.close();
    }
}
