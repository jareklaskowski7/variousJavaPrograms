/*
 A perfect number is a positive integer that is equal to the sum
of its proper positive divisors, that is, the sum of its positive
divisors excluding the number itself. Equivalently, a perfect number
is a number that is half the sum of all of its positive divisors.
The first perfect number is 6, because 1, 2 and 3 are its proper
positive divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6
is equal to half the sum of all its positive divisors:
		( 1 + 2 + 3 + 6 ) / 2 = 6.
    */

import java.util.LinkedList;
import java.util.List;

public class PerfectNumber {
    public static boolean checkPerfectNumber(int number) {
        boolean isPerfectNumber = false;
        int halfNumber = number / 2;
        if (number >= 6 && halfNumber * 2 == number) {
            List<Integer> positiveDivisors = new LinkedList<>();
            for (int i = 0; i < halfNumber; i++) {
                int positiveDivisor = i + 1;
                int result = number / positiveDivisor * positiveDivisor;
                if (result == number)
                    positiveDivisors.add(positiveDivisor);
            }

            int sumNumberPositiveDivisors = 0;
            for (Integer positiveDivisor : positiveDivisors)
                sumNumberPositiveDivisors += positiveDivisor;

            if (number == sumNumberPositiveDivisors)
                isPerfectNumber = true;
        }

        return isPerfectNumber;
    }

    public static void main(String[] args) {
        int number1 = 6;
        boolean isPerfectNumber1 = checkPerfectNumber(number1);
        if (isPerfectNumber1)
            System.out.println("Number " + number1 + " is perfect number");
        else
            System.out.println("Number " + number1 + " is not perfect number");

        int number2 = 20;
        boolean isPerfectNumber2 = checkPerfectNumber(number2);
        if (isPerfectNumber2)
            System.out.println("Number " + number2 + " is perfect number");
        else
            System.out.println("Number " + number2 + " is not perfect number");

        int number3 = 51;
        boolean isPerfectNumber3 = checkPerfectNumber(number3);
        if (isPerfectNumber3)
            System.out.println("Number " + number3 + " is perfect number");
        else
            System.out.println("Number " + number3 + " is not perfect number");

        int number4 = -28;
        boolean isPerfectNumber4 = checkPerfectNumber(number4);
        if (isPerfectNumber4)
            System.out.println("Number " + number4 + " is perfect number");
        else
            System.out.println("Number " + number4 + " is not perfect number");

        int number5 = 358;
        boolean isPerfectNumber5 = checkPerfectNumber(number5);
        if (isPerfectNumber5)
            System.out.println("Number " + number5 + " is perfect number");
        else
            System.out.println("Number " + number5 + " is not perfect number");

        int number6 = 496;
        boolean isPerfectNumber6 = checkPerfectNumber(number6);
        if (isPerfectNumber6)
            System.out.println("Number " + number6 + " is perfect number");
        else
            System.out.println("Number " + number6 + " is not perfect number");
    }
}
