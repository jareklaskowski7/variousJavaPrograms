//

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumbersLinkedListRecursion {
    private static int countFibonacciNumbers;
    private static int x = 0;
    private static int y = 1;
    private static List<Integer> fibonacciNumbers = new LinkedList<>();

    public static void setCountFibonacciNumbers(int countFibonacciNumbers) {
        FibonacciNumbersLinkedListRecursion.countFibonacciNumbers = countFibonacciNumbers;
    }

    public static void calculateFibonacciNumbers1(int countFibonacciNumbers) {
        fibonacciNumbers.add(x);
        x += y;
        countFibonacciNumbers--;
        if (countFibonacciNumbers > 0) {
            fibonacciNumbers.add(y);
            y += x;
            countFibonacciNumbers--;
            if (countFibonacciNumbers > 0)
                calculateFibonacciNumbers1(countFibonacciNumbers);
        }
    }

    public static void calculateFibonacciNumbers2(int countFibonacciNumbers) {
        int fibonacciCounter = 0;
        while (countFibonacciNumbers > 0 && fibonacciCounter <= 2) {
            switch (fibonacciCounter) {
                case 0:
                    fibonacciNumbers.add(x);
                    x += y;
                    countFibonacciNumbers--;
                    fibonacciCounter++;
                    break;
                case 1:
                    fibonacciNumbers.add(y);
                    y += x;
                    countFibonacciNumbers--;
                    fibonacciCounter++;
                    break;
                case 2:
                    calculateFibonacciNumbers2(countFibonacciNumbers);
                    fibonacciCounter++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the desired length of Fibonacci sequence: ");
        setCountFibonacciNumbers(scan.nextInt());
        if (countFibonacciNumbers > 0) {
            calculateFibonacciNumbers2(countFibonacciNumbers);
            System.out.println("Fibonacci Numbers are:");
            for (int i = 0; i < fibonacciNumbers.size(); i++) {
                System.out.print(fibonacciNumbers.get(i));
                if (i < fibonacciNumbers.size() - 1)
                    System.out.print(", ");
                else
                    System.out.print(".");
            }
        } else {
            System.out.println("Please enter the number greater than 0!");
        }
        scan.close();
    }
}
