import java.util.Arrays;

public class BubbleSortRegArray {
    public static int[] bubbleSortRegArray(int[] regArray) {
        for (int i = 0; i < regArray.length - 1; i++)
            for (int j = i + 1; j < regArray.length; j++)
                if (regArray[i] > regArray[j]) {
                    int tempNumber = regArray[i];
                    regArray[i] = regArray[j];
                    regArray[j] = tempNumber;
                }

        return regArray;
    }

    public static void main(String[] args) {
        int[] numbers = {-3, 4, -10, 0, 7, 23, -19, -37, 41, 49, -52, 63, 27, -28, 0, 23};
        int[] sortedRegArray = bubbleSortRegArray(numbers);
        System.out.println("Sorted Regular Array:");
        System.out.println(Arrays.toString(sortedRegArray));
    }
}
