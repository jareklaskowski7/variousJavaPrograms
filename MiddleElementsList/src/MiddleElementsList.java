// Find middle element of linked list in one pass

import java.util.ArrayList;
import java.util.Arrays;

public class MiddleElementsList {
    public static int[] findMiddleElementsList(ArrayList<Integer> lst) {
        int halfSize = lst.size() / 2;
        int[] middleElementsList = new int[]{0, 0};

        if (halfSize * 2 == lst.size()) {
            middleElementsList[0] = lst.get(halfSize - 1);
            middleElementsList[1] = lst.get(halfSize);
        } else {
            middleElementsList[0] = lst.get(halfSize);
        }

        return middleElementsList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(7, 4, 16, 9, 28, 17, 35));
        int[] middleElementsLinkedList1 = findMiddleElementsList( lst1);
        for (int middleElementLinkedList : middleElementsLinkedList1)
            if (middleElementLinkedList != 0)
                System.out.println("middleElementLinkedList1 == " + middleElementLinkedList);

        ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(7, 4, 16, 9, 56, 28, 17, 35));
        int[] middleElementsLinkedList2 = findMiddleElementsList(lst2);
        for (int middleElementLinkedList : middleElementsLinkedList2)
            if (middleElementLinkedList != 0)
                System.out.println("middleElementLinkedList2 == " + middleElementLinkedList);
    }
}
