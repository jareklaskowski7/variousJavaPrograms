/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
Note:
Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

import java.util.LinkedList;
import java.util.List;

public class TwoSum {
    public static List<int[]> twoSum(int[] numbers, int target) {
        List<int[]> twoIndices = new LinkedList<>();
        for (int i = 0; i < numbers.length - 1; i++)
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[i] + numbers[j] == target) {
                    int[] twoIndex = new int[]{i + 1, j + 1};
                    twoIndices.add(twoIndex);
                }

        return twoIndices;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        List<int[]> twoIndices = twoSum(numbers, target);
        for (int[] twoIndex : twoIndices)
            System.out.println("[" + twoIndex[0] + "," + twoIndex[1] + "]");
    }
}
