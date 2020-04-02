import java.util.Scanner;

public class FactorialNumberRecursion {
    private static long number;

    public static void setNumber(long number) {
        FactorialNumberRecursion.number = number;
    }

    public static long calculateFactorialNumber(long number) {
        if (number == 0 || number == 1)
            number = 1;
        else if (number > 1)
            number *= calculateFactorialNumber(number - 1);
        return number;
    }

    /*
    public static long calculateFactorialNumber(long number) {
        if (number == 0 || number == 1)
            return 1;
        return calculateFactorialNumber(number - 1) * number;
    }
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the positive number: ");
        setNumber(scan.nextLong());
        if (number >= 0)
            System.out.println("The factorial of " + number + " is: " + calculateFactorialNumber(number) + ".");
        scan.close();
    }
}
