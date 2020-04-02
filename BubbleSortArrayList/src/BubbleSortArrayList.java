import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortArrayList {
    public static List<Integer> bubbleSortArrayList(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++)
            for (int j = i + 1; j < arrayList.size(); j++)
                if (arrayList.get(i) > arrayList.get(j)) {
                    int tempNumber = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, tempNumber);
                }

        return arrayList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(-3, 4, -10, 0, 7, 23, -19, -37, 41, 49, -52, 63, 27, -28, 0, 23));
        List<Integer> sortedArrayList = bubbleSortArrayList(numbers);
        System.out.println("Sorted ArrayList:");
        for (int i = 0; i < sortedArrayList.size(); i++) {
            System.out.print(sortedArrayList.get(i));
            if (i < sortedArrayList.size() - 1)
                System.out.print(", ");
            else
                System.out.print(".");
        }
    }
}
