// Description:
// Below example shows how to find out sum of each digit in the given number using recursion logic.
// For example, if the number is 259, then the sum should be 2+5+9 = 16.

public class SumEachDigitRecursion {
    public static int calculateSumEachDigitRecursion(int number) {
        if (number >= 1) {
            System.out.println("number == " + number);
            int digit = number % 10;
            System.out.println("digit == " + digit);
            return digit + calculateSumEachDigitRecursion(number / 10);
        }

        return 0;
    }

    /*
    public static int sumEachDigitRecursion(int number, int lenNumber) {
        if (lenNumber > 0) {
            int times = (int) Math.pow(10, lenNumber);
            int digit = number % times / (times / 10);
            lenNumber--;
            return digit + sumEachDigitRecursion(number, lenNumber);
        }

        return 0;
    }
    */

    public static void main(String[] args) {
        int number = 251;
        int sumEachDigitRecursion = calculateSumEachDigitRecursion(number);
        //String strNumber = String.valueOf(number);
        //int lenNumber = strNumber.length();
        //int sumEachDigitRecursion = SumEachDigitRecursion.sumEachDigitRecursion(number, lenNumber);
        System.out.println("Sum of each digit of a number " + number + " equals " + sumEachDigitRecursion);
    }
}
