package com.theironyard.charlotte;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public String name = "Ben";

    public static void main(String[] args) {
	    // write your code here
//
//        System.out.println(isPalindrome("A Santa at Nasa"));
//        System.out.println(isPalindrome("Avid Diva"));
//        System.out.println(isPalindrome("Tub"));


        int[] numbers = divisibles(new int[] { 10, 4, 18, 36, 45, 54, 63 }, new int[] { 9, 2 });

        for(int i : numbers) {
            System.out.println(i);
        }
    }

    public static int[] divisibles(int[] numbers, int[] divisors) {
        int divisor = Arrays.stream(divisors).reduce(1, (i, j) -> i * j);

        return Arrays.stream(numbers).filter(i -> i % divisor == 0).toArray();
    }

    public static Integer[] divisiblesSimple(int[] numbers, int[] divisors) {
        int divisor = 1;

        for (int i : divisors) {
            divisor *= i;
        }

        ArrayList<Integer> validNumbers = new ArrayList<>();

        for (int i : numbers) {
            if (i % divisor == 0) {
                validNumbers.add(i);
            }
        }

        return validNumbers.toArray(new Integer[0]);
    }

    public static boolean isPalindrome(String input) {
        if (input.length() == 0) {
            return true;
        }

        input = input.replaceAll(" ", "").toLowerCase();

        char lastChar = input.charAt(input.length() - 1);
        return input.charAt(0) == lastChar
                && isPalindrome(input.substring(1, input.length() - 1));
    }

    public static boolean isPalindromeTwo(String input) {
        input = input.replaceAll(" ", "").toLowerCase();

        for (int i = 0;i < input.length();i++) {
            if (input.charAt(i) != input.charAt(input.length() - (i + 1))) {
                return false;
            }
        }

        return true;
    }
}