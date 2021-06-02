import java.util.Arrays;
import java.util.Scanner;

public class Code1 {
    private static int countFibonacciNumbers;

    public static void setCountFibonacciNumbers(int countFibonacciNumbers) {
        Code1.countFibonacciNumbers = countFibonacciNumbers;
    }

    public static long[] calculateFibonacciNumbers(int sizeFibonacciNumbers) {
        long[] fibonacciNumbers = new long[sizeFibonacciNumbers];
        switch (sizeFibonacciNumbers) {
            case 1 -> fibonacciNumbers[0] = 0;
            case 2 -> {
                fibonacciNumbers[0] = 0;
                fibonacciNumbers[1] = 1;
            }
            default -> {
                fibonacciNumbers[0] = 0;
                fibonacciNumbers[1] = 1;
                for (int idx = 2; idx < fibonacciNumbers.length; idx++)
                    fibonacciNumbers[idx] = fibonacciNumbers[idx - 2] + fibonacciNumbers[idx - 1];
            }
        }

        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the desired length of Fibonacci sequence: ");
        while (countFibonacciNumbers <= 0) {
            setCountFibonacciNumbers(scan.nextInt());
            if (countFibonacciNumbers > 0) {
                long[] fibonacciNumbers = calculateFibonacciNumbers(countFibonacciNumbers);
                //System.out.println(Arrays.toString(fibonacciNumbers));
                for (int i = 0; i < fibonacciNumbers.length; i++) {
                    System.out.print(i);
                    if (i < fibonacciNumbers.length - 1)
                        System.out.print(", ");
                    else
                        System.out.print(".");
                }
            } else {
                System.out.print("Please enter the desired length of Fibonacci sequence: ");
            }
        }
        scan.close();
    }
}
