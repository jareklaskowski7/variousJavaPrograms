import java.util.Scanner;

public class EvenOddNumbers {
    private static int number;

    public static void setNumber(int number) {
        EvenOddNumbers.number = number;
    }

    public static String checkEvenOddNumbers(int number) {
        String evenOdd = "odd";
        if (number % 2 == 0)
            evenOdd = "even";

        return evenOdd;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        setNumber(scan.nextInt());
        System.out.println("The number is: " + checkEvenOddNumbers(number));
        scan.close();
    }
}
