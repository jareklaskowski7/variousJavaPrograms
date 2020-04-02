import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumbersRegArraySwitch {
    private static int countFibonacciNumbers;

    public static void setCountFibonacciNumbers(int countFibonacciNumbers) {
        FibonacciNumbersRegArraySwitch.countFibonacciNumbers = countFibonacciNumbers;
    }

    public static long[] calculateFibonacciNumbers(int sizeFibonacciNumbers) {
        long[] fibonacciNumbers = new long[sizeFibonacciNumbers];
        switch (sizeFibonacciNumbers) {
            case 1:
                fibonacciNumbers[0] = 0;
                break;
            case 2:
                fibonacciNumbers[0] = 0;
                fibonacciNumbers[1] = 1;
                break;
            default:
                fibonacciNumbers[0] = 0;
                fibonacciNumbers[1] = 1;
                for (int idx = 2; idx < fibonacciNumbers.length; idx++)
                    fibonacciNumbers[idx] = fibonacciNumbers[idx - 2] + fibonacciNumbers[idx - 1];
        }

        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the desired length of Fibonacci sequence: ");
        setCountFibonacciNumbers(scan.nextInt());
        if (countFibonacciNumbers > 0) {
            long[] fibonacciNumbers = calculateFibonacciNumbers(countFibonacciNumbers);
            System.out.println(Arrays.toString(fibonacciNumbers));
        } else {
            System.out.println("Please enter the number greater than 0!");
        }
        scan.close();
    }
}
