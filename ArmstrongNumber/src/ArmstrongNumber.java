// A number is called an Armstrong number if it is equal to the cube of its each digit.
// for example, 153 is an Armstrong number because 153= 1+ 125+27 which is equal to 1^3+5^3+3^3.

public class ArmstrongNumber {
    public static boolean checkArmstrongNumber(int number) {
        boolean isArmstrongNumber = false;
        String strArmstrongNumber = String.valueOf(number);
        int lenArmstrongNumber = strArmstrongNumber.length();

        /*
        int first = number % 1000 / 100;
        System.out.println("first == " + first);
        int second = number % 100 / 10;
        System.out.println("second == " + second);
        int third = number % 10 / 1;
        System.out.println("third == " + third);
        */

        int[] digits = new int[lenArmstrongNumber];
        for (int i = 0, times = (int) Math.pow(10, lenArmstrongNumber); i < lenArmstrongNumber; i++, times /= 10)
            digits[i] = number % times / (times / 10);

        int sumCubeDigits = 0;
        for (int digit : digits)
            sumCubeDigits += (int) Math.pow(digit, lenArmstrongNumber);

        if (number == sumCubeDigits)
            isArmstrongNumber = true;

        return isArmstrongNumber;
    }

    public static void main(String[] args) {
        //int number = 153;
        //int number = 184;
        //int number = 9474;
        int number = 54748;
        boolean isArmstrongNumber = checkArmstrongNumber(number);
        if (isArmstrongNumber)
            System.out.println("Number " + number + " is armstrong number");
        else
            System.out.println("Number " + number + " is not armstrong number");
    }
}
