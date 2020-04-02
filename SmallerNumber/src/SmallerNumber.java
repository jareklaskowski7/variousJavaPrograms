import java.util.Scanner;

public class SmallerNumber {
    private static double firstNumber;
    private static double secondNumber;

    public static void setFirstNumber(double firstNumber) {
        SmallerNumber.firstNumber = firstNumber;
    }

    public static void setSecondNumber(double secondNumber) {
        SmallerNumber.secondNumber = secondNumber;
    }

    public static double findSmallerNumber(double firstNumber, double secondNumber) {
        double smallerNumber;
        smallerNumber = Math.min(firstNumber, secondNumber);
        return smallerNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        setFirstNumber(scan.nextDouble());
        System.out.print("Please enter the second number: ");
        setSecondNumber(scan.nextDouble());
        double smallerNumber = findSmallerNumber(firstNumber, secondNumber);
        System.out.println("The smaller number is " + smallerNumber);
        scan.close();
    }
}
