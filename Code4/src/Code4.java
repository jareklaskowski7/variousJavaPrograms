import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code4 {
    private static List<Integer> container;

    public static int findMaxValue(List<Integer> container) {
        int maxValue = container.get(0);
        for (int i = 1; i < container.size(); i++)
            if (container.get(i) > maxValue)
                maxValue = container.get(i);

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        container = new ArrayList<>();
        System.out.println("Please populate the ArrayList by entering numbers and hitting enter after each number. (Any non-number/non-digit to exit)");
        System.out.print("Please enter the number: ");
        while (scan.hasNextInt()) {
            container.add(scan.nextInt());
            System.out.print("Please enter the number: ");
        }
        System.out.println("Number " + findMaxValue(container) + " is the maximum value in this ArrayList");
        scan.close();
    }
}
