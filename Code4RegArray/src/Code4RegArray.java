import java.util.Scanner;

public class Code4RegArray {
    private static int[] container;
    private static int lengthArray;

    public static void setLengthArray(int lengthArray) {
        Code4RegArray.lengthArray = lengthArray;
    }

    public static int findMaxValue(int[] container) {
        int maxValue = container[0];
        for (int i = 1; i < container.length; i++)
            if (container[i] > maxValue)
                maxValue = container[i];

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers would you like to have in this array? ");
        while (container == null) {
            lengthArray = scan.nextInt();
            if (lengthArray > 0) {
                setLengthArray(lengthArray);
                container = new int[lengthArray];
                System.out.println("Please populate the array by entering numbers and hitting enter after each number.");
                while (lengthArray > 0) {
                    System.out.print("Please enter the number: ");
                    container[container.length - lengthArray] = scan.nextInt();
                    lengthArray--;
                }
                System.out.println("Number " + findMaxValue(container) + " is the maximum value in this regular array");
            } else {
                System.out.print("How many numbers would you like to have in the array? ");
            }
        }
        scan.close();
    }
}
