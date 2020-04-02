/*
    Please implement this method to return the number in the array that is closest to zero.
	If there are two equally far from zero elements like 2 and -2,
	consider the positive element to be "closest" to zero.
	*/

import java.util.*;
import java.util.stream.Collectors;

public class NumbersClosestToZeroGivenNumber {
    public static int getNumberClosestToZero(int[] numbers) {
        int numberClosestToZero = 0;
        if (numbers.length >= 1) {
            numberClosestToZero = Math.abs(numbers[0]);
            for (int i = 0; i < numbers.length - 1; i++)
                if (numberClosestToZero > Math.abs(numbers[i + 1]))
                    numberClosestToZero = Math.abs(numbers[i + 1]);
        }

        return numberClosestToZero;
    }

    public static int[] getNegPosNumberClosestToZero(int[] numbers) {
        Set<Integer> uniqueNumbers = Arrays
                .stream(numbers)
                .boxed()
                .collect(Collectors
                        .toSet());
        List<Integer> negativeNumbers = uniqueNumbers
                .stream()
                .filter(element -> element < 0)
                .sorted()
                .collect(Collectors.toList());
        List<Integer> positiveNumbers = uniqueNumbers
                .stream()
                .filter(element -> element > 0)
                .sorted()
                .collect(Collectors.toList());

        int[] negPosNumberClosestToZero = {0, 0};
        if (negativeNumbers.size() >= 1)
            negPosNumberClosestToZero[0] = negativeNumbers.get(negativeNumbers.size() - 1);
        if (positiveNumbers.size() >= 1)
            negPosNumberClosestToZero[1] = positiveNumbers.get(0);

        return negPosNumberClosestToZero;
    }

    public static int[] getNumbersClosestToGivenNumber(int[] numbers, int number) {
        Set<Integer> uniqueNumbers = Arrays
                .stream(numbers)
                .boxed()
                .collect(Collectors
                        .toSet());

        List<Integer> numbersLessThanGivenNumber = new ArrayList<>();
        List<Integer> numbersGreaterThanGivenNumber = new ArrayList<>();

        for (int uniqueNumber : uniqueNumbers)
            if (uniqueNumber < number)
                numbersLessThanGivenNumber.add(uniqueNumber);
            else if (uniqueNumber > number)
                numbersGreaterThanGivenNumber.add(uniqueNumber);

        int[] numbersClosestToGivenNumber = {number, number};

        if (numbersLessThanGivenNumber.size() >= 1) {
            int numberLessThanGivenNumber = numbersLessThanGivenNumber.get(0);
            for (int i = 0; i < numbersLessThanGivenNumber.size() - 1; i++)
                if (Math.abs(number - numberLessThanGivenNumber) > Math.abs(number - numbersLessThanGivenNumber.get(i + 1)))
                    numberLessThanGivenNumber = numbersLessThanGivenNumber.get(i + 1);
            numbersClosestToGivenNumber[0] = numberLessThanGivenNumber;
        }

        if (numbersGreaterThanGivenNumber.size() >= 1) {
            int numberGreaterThanGivenNumber = numbersGreaterThanGivenNumber.get(0);
            for (int i = 0; i < numbersGreaterThanGivenNumber.size() - 1; i++)
                if (Math.abs(number - numberGreaterThanGivenNumber) > Math.abs(number - numbersGreaterThanGivenNumber.get(i + 1)))
                    numberGreaterThanGivenNumber = numbersGreaterThanGivenNumber.get(i + 1);
            numbersClosestToGivenNumber[1] = numberGreaterThanGivenNumber;
        }

        return numbersClosestToGivenNumber;
    }

    public static void main(String[] args) {
        int[] numbers1 = {81, -25, -37, -1, 6, 92, 73, 14, -9, -64, -53, -5, 8, -6, 57, -8, 1, 12};
        int numberClosestToZero = getNumberClosestToZero(numbers1);
        System.out.println("The number closest to zero is: " + numberClosestToZero);

        int[] numbers2 = {81, -25, -37, 6, 92, 73, 14, -9, -64, -53, -5, 8, -6, 57, -8, 1, 12};
        int[] negPosNumberClosestToZero = getNegPosNumberClosestToZero(numbers2);
        System.out.println("The numbers closest to zero are: " + negPosNumberClosestToZero[0] + " and " + negPosNumberClosestToZero[1] + ".");

        int[] numbers3 = {81, -25, -37, -1, 6, 92, 73, 14, -9, -64, -53, 40, -5, 8, -6, 57, -8, 1, 12};
        int number = 54;
        int[] numbersClosestToGivenNumber = getNumbersClosestToGivenNumber(numbers3, number);
        System.out.println("The numbers closest to " + number + " are: " + numbersClosestToGivenNumber[0] + " and " + numbersClosestToGivenNumber[1] + ".");
    }
}
