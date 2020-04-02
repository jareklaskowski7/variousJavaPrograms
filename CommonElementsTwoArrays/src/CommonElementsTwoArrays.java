// Write a program to identify common elements or numbers between two given arrays.
// You should not use any inbuilt methods are list to find common values.

import java.util.ArrayList;
import java.util.List;

public class CommonElementsTwoArrays {
    public static List<Integer> findCommonElementsTwoArrays(int[] arr1, int[] arr2) {
        List<Integer> commonElementsTwoArrays = new ArrayList<>();

        /*
        for (int i = 0; i < arr1.length; i++)
            for (int j = 0; j < arr2.length; j++)
                if (arr1[i] == arr2[j])
                    commonElements.add(arr1[i]);
                    */

        for (int x : arr1)
            for (int y : arr2)
                if (x == y)
                    commonElementsTwoArrays.add(x);

        return commonElementsTwoArrays;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 8, 2, 9, 7, 1};
        int[] arr2 = {3, 6, 8, 9, 2, 5};
        List<Integer> commonElementsTwoArrays = findCommonElementsTwoArrays(arr1, arr2);
        for (Integer commonElement : commonElementsTwoArrays)
            System.out.println(commonElement);
    }
}
