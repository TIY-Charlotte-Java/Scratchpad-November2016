package com.theironyard.charlotte;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public String name = "Ben";

    public static void main(String[] args) {
    }

    public static int longx(String input) {
        // the longest run we've seen
        int longestRun = 0;

        // the current run
        int run = 0;

        // for each character..
        for (int i = 0;i < input.length();i++) {
            // if it's an x, add one to the current run

            if (input.charAt(i) == 'x') {
                run++;

                // there's a chance that this run
                // is longer than any we've seen so far
                // so check for that
                if (run > longestRun) {
                    longestRun = run;
                }
            } else {
                // if it's not an x, we're not in a run
                // anymore, so reset our run variable
                run = 0;
            }
        }

        return longestRun;
    }

    public static int gimme(int[] numbers) {
        // Math.random() returns a pseudo-random double between .00 and .99,
        // if you multiply it by the max number possible, you get basically
        // a random number from 0-max number.


        int idx = (int)(Math.random() * numbers.length);
        int otherIdxForExample = (int)Math.floor(Math.random() * numbers.length);

        return numbers[idx];
    }

    public static boolean balanced(String input, char letter) {
        char[] chars = input.toCharArray();

        int matches = 0;
        int notMatches = 0;

        for (int i = 0;i < chars.length;i++) {
            if (chars[i] == letter) {
                matches++;
            } else {
                notMatches++;
            }
        }

        return matches == notMatches;
    }


    public static String titleCase(String input) {
        input = input.toLowerCase();

        String[] words = input.split(" ");

        for (int i = 0;i < words.length;i++) {
            String currentWord = words[i];

            words[i] =
                currentWord.substring(0, 1).toUpperCase() +
                currentWord.substring(1);
        }

        return String.join(" ", words);
    }



//    public static String titleCase(String input) {
//        input = input.toLowerCase();
//        String result = "";
//        String[] words = input.split(" ");
//
//        for (int i = 0;i < words.length;i++) {
//            String currentWord = words[i];
//            currentWord = currentWord.substring(0, 1).toUpperCase() + currentWord.substring(1);
//            result += currentWord;
//
//            if (i < words.length - 1) {
//                result += " ";
//            }
//        }
//
//        return result;
//    }

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