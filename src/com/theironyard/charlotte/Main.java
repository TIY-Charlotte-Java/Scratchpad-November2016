package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Main {
    public String name = "Ben";

    public static void main(String[] args) {
        int[] numbers;

        numbers = new int[10];
        numbers = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Object[] objects;

        objects = new Object[10];
        objects = new Object[] { new Object() };

        ArrayList<Integer> arrayListNumbers;

        arrayListNumbers = new ArrayList<>();
        arrayListNumbers.add(1);
        arrayListNumbers.add(2);
        arrayListNumbers.add(3);
        // etcetera and etcetera.


        ArrayList<String> arrayListStrings;

        arrayListStrings = new ArrayList<>();
        arrayListStrings.add("Hello");
        arrayListStrings.add("World!");
        arrayListStrings.add("Pants");
        arrayListStrings.removeIf(s -> s.equals("Pants!"));
        arrayListStrings.size();

        HashMap<Integer, String> hashMapTest = null;

        hashMapTest.put(11, "birthMonth");
        hashMapTest.put(6, "birthDay");
        hashMapTest.put(1986, "birthYear");
        hashMapTest.get(11);

        hashMapTest.get("birthMonth");


        HashMap<String, Color> colors = new HashMap<>();

        colors.put("red", new Color(255, 0, 0));
        colors.put("purple", new Color(255, 0, 255));

        colors.get("red").getRed();

    }

    public static double monteCarloPi() {
        int side = 10;
        int successes = 0;
        int trials = 100000000;

        for (int i = 0;i < trials;i++) {
            double x = Math.random() * side;
            double y = Math.random() * side;

            double distance = Math.sqrt(x*x + y*y);

            if (distance <= side) {
                successes++;
            }
        }

        return 4 * ((double)successes / trials);
    }

    public static double flipper() {
        int successes = 0, tries = 1000000;

        for (int i = 0;i < tries;i++) {
            if (Math.random() >= .2 &&
                Math.random() >= .2 &&
                Math.random() >= .2) {
                successes++;
            }
        }

        return (double)successes / tries;
    }

    public static int cherokeeHare(int startingPopulation, double birthRate, int weeks) {
        double population = startingPopulation;

        for (int i = 0;i < weeks;i++) {
            population = population * (1 + birthRate);
        }

        return (int)population;
    }

    // An alternative approach to the boost problem
    // using ints.
    public static int boostAlternative(int input) {
        ArrayList<Integer> digits = new ArrayList<>();
        int results = 0;

        while (input > 0) {
            int currentDigit = input % 10;

            currentDigit = ++currentDigit % 10;

            digits.add(currentDigit);

            input /= 10;
        }

        for (int i = 0;i < digits.size();i++) {
            int place = (int)Math.pow(10, i);

            results += place * digits.get(i);
        }


        return results;
    }

    public static int boost(int input) {
        String stringInput = String.valueOf(input);
        String output = "";

        for (int i = 0;i < stringInput.length();i++) {
            String currentDigit = stringInput.substring(i, i + 1);
            output += String.valueOf(
                    (Integer.valueOf(currentDigit) + 1) % 10
            );
        }

        return Integer.valueOf(output);
    }

    public static Color simpleBlend(Color[] colors) {
        int redSum = 0;
        int greenSum = 0;
        int blueSum = 0;

        for (Color c : colors) {
            redSum += c.getRed();
            greenSum += c.getGreen();
            blueSum += c.getBlue();
        }

        return new Color(redSum / colors.length, greenSum / colors.length, blueSum / colors.length);
    }

    public static Color blend(Color[] colors) {
        double reds = Arrays.stream(colors).collect(Collectors.averagingInt(Color::getRed));
        double greens = Arrays.stream(colors).collect(Collectors.averagingInt(Color::getGreen));
        double blues = Arrays.stream(colors).collect(Collectors.averagingInt(Color::getBlue));

        return new Color((int)reds, (int)greens, (int)blues);
    }

    public static boolean unsortedOther(int[] first, int[] second) {
        if (first.length != second.length) {
            return false;
        }

        for (int firstNumber : first) {
            boolean found = false;

            for (int secondNumber : second) {
                if (firstNumber == secondNumber) {
                    found = true;
                }
            }

            if (found) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }


    public static boolean unsorted(int[] first, int[] second) {
        if (first.length != second.length) {
            return false;
        }

        Arrays.sort(first);
        Arrays.sort(second);


        for (int i = 0;i < first.length;i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean sleepIn(boolean isWeekDay, boolean isOnVacation) {
        return !isWeekDay || isOnVacation;
    }

    public static int silver(int[] numbers) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            }
        }

        return secondLargest;
    }

    public static int capitalizedStreams(String input) {
        return (int)(input.chars().map(c -> (char) c).filter(Character::isUpperCase).count());
    }


    public static int capitalized(String input) {
        int capitalizedLetters = 0;

        // one way to write for loops,
        // and is the same as other languages
        for (int i = 0;i < input.length();i++) {
            char c = input.charAt(i);


        }

        // java gives you this one as kind of a helper
        // because people did this so much.
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalizedLetters++;
            }
        }

        return capitalizedLetters;
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