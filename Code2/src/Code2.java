import java.util.Arrays;

public class Code2 {
    public static void main(String[] args) {
        // Binary search is the fastest way to find given integer in a sorted array
        // Create the sorted array
        int[] elements = new int[1000000];
        for (int i = 0; i < 1000000; i++)
            elements[i] += i * 10;
        // Display elements in the array
        for (int i = 0; i < 1000000; i++)
            System.out.println("elements[" + i + "]: " + elements[i]);

        int i = 894570;
        int j = 567264;
        int idx = Arrays.binarySearch(elements, i);
        int jdx = Arrays.binarySearch(elements, j);

        if (idx >= 0)
            System.out.println("The element " + i + " is found at the index " + idx);
        else
            System.out.println("The element " + i + " is not found in this array");

        if (jdx >= 0)
            System.out.println("The element " + j + " is found at the index " + jdx);
        else
            System.out.println("The element " + j + " is not found in this array");
    }
}
