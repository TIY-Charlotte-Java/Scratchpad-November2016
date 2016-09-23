package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public String name = "Ben";






    public static String reverseHalfInts(String input) {
        int[] characters = input.chars().toArray();

        for (int i = 0;i < characters.length / 2;i++) {
            int otherIdx = characters.length - 1 - i;

            // trying to swap a = 7, b = 3

            // a = a + b // => a = 10, b = 3
            // b = a - b // => a = 10, b = 7
            // a = a - b // => a = 3, b = 7
            characters[i] = characters[otherIdx] + characters[i];
            characters[otherIdx] = characters[i] - characters[otherIdx];
            characters[i] = characters[i] - characters[otherIdx];
        }

        char[] chars = new char[characters.length];

        for (int i = 0;i < chars.length;i++) {
            chars[i] = (char)characters[i];
        }

        return new String(chars);
    }

    public static String reverseHalf(String input) {
        char[] characters = input.toCharArray();

        for (int i = 0;i < characters.length / 2;i++) {
            int otherIdx = characters.length - 1 - i;

            char temp = characters[i];

            characters[i] = characters[otherIdx];
            characters[otherIdx] = temp;
        }

        return new String(characters);
    }

    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();

        for(int i = input.length() - 1;i >= 0;i--) {
            sb.append(input.charAt(i));
        }

        return sb.toString();
    }

    public static Color heat(int heatPercentage) throws Exception {
        if (heatPercentage < 0 || heatPercentage > 100) {
            throw new Exception("heatPercentage must be 0 - 100 inclusive");
        }

        double percentage = heatPercentage / 100.0;

        return new Color((int)(percentage * 255), 0, (int)((1.00 - percentage) * 255));
    }

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
        colors.get("red").getBlue();

        Color white = new Color(255, 255, 255);

        white.getRed();
    }

//    public static List<Table> organizer() throws FileNotFoundException{
////        Type listType = new TypeToken<ArrayList<Attendee>>(){}.getType();
//        File f = new File("people.json");
//        Scanner fileScanner = new Scanner(f);
//        fileScanner.useDelimiter("\\Z");
//
//        Gson gson = new Gson();
//
//        List<Attendee> attendees = gson.fromJson(fileScanner.next(), AttendeeArrayList.class);
//
//        attendees.sort((a, b) -> a.getFoodChoice().hashCode() - b.getFoodChoice().hashCode());
//
//        List<Table> results = new ArrayList<>();
//
//        for (Attendee a : attendees) {
//            Table lastTable;
//
//            if (results.size() > 0) {
//                lastTable = results.get(results.size() - 1);
//            } else {
//                lastTable = new Table();
//                results.add(lastTable);
//            }
//
//
//
//        }
//    }

    public static int desirable(String input) {
        char[] charString = input.toCharArray();
        int desirables = 0;

        // for each character in the array:
        for (int i = 0;i < charString.length;i++) {
            // if the character is an "H":
            if (charString[i] == 'H') {
                // iterate from index - 2 through index + 2
                for (int j = 1;j <= 2;j++) {
                    // and increment desirables if any character
                    // at that index is R

                    if (i - j >= 0) {
                        if (charString[i - j] == 'R') {
                            desirables++;
                            break;
                        }
                    }

                    if (i + j < charString.length) {
                        if (charString[i + j] == 'R') {
                            desirables++;
                            break;
                        }
                    }
                }
            }
        }

        return desirables;
    }

    public static int rosebud(String input) {
        Pattern p = Pattern.compile("rosebud(!*)1", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);

        if (m.matches()) {
            return m.group(1).length();
        } else {
            return 0;
        }
    }

    public static int movableThingsCrash(Movable a, Movable b) {
        // figure out which movable object came first (position-wise)
        Movable first  = a.position < b.position ? a : b;
        Movable second = a.position < b.position ? b : a;

        // so if the first object is moving faster than the second,
        if (first.speed > second.speed) {
            // then we determine the relative velocity and relative position,
            int relativeVelocity = first.speed - second.speed;
            int distanceToTravel = second.position - first.position;

            // get the time by dividing distance by velocity
            double time = (double)distanceToTravel / relativeVelocity;

            // multiply the time by the velocity and add the original position,
            // return that added to the original position
            return (int)(time * first.speed) + first.position;
        }

        // else return -1 to indicate they never collide
        else {
            return -1;
        }
    }

    public static int[] climb(int number, int lengthOfArray) {
        int[] results = new int[lengthOfArray];

        for (int i = 0;i < lengthOfArray;i++) {
            number += i;
            results[i] = number;
        }

        return results;
    }

    public static boolean isNarcissistic(int number) {
        String numberString = String.valueOf(number);
        int numberLength = numberString.length();
        int sum = 0;

        for (int i = 0;i < numberLength;i++) {
            int thisNumber = Integer.valueOf(numberString.substring(i, i + 1));

            sum += Math.pow(thisNumber, numberLength);
        }

        return sum == number;
    }

    public static int[] fibonacci(int length) {
        int[] results = new int[length];

        IntIndexArrayFunction fibGenerator = (array, i) -> {
            if (i < 2) {
                return 1;
            } else return array[i - 1] + array[i - 2];
        };

        for (int i = 0;i < length;i++) {
            results[i] = fibGenerator.apply(results, i);
        }

        return results;
    }

    public static double nemo() {
        int trials = 1000000;
        int saveDays = 20;
        int survivals = 0;
        double fishRate = .80;
        ArrayList<Integer> deathDays = new ArrayList<>();

        for (int i = 0;i < trials;i++) {
            int fish = 10;

            for (int j = 0;j < saveDays;j++) {
                if (fish == -1) {
                    deathDays.add(j);
                    break;
                }

                if (Math.random() > fishRate) {
                    fish--;
                }
            }

            if (fish >= 0) {
                survivals++;
            }
        }

        double averageDaysSurvived = deathDays.stream().collect(Collectors.averagingDouble(i -> i));
        double standardDeviation = deathDays.stream().map(i -> Math.abs(averageDaysSurvived - i)).collect(Collectors.averagingDouble(i -> i));

        System.out.printf("Average Death Day: %f. Standard Deviation: %f", averageDaysSurvived, standardDeviation);

        return (double)survivals / trials;
    }

    public static String weave(String input, int replaceKey) {
        char[] characters = input.toCharArray();

        for (int i = 0;i < characters.length;i++) {
            if (i % replaceKey == 0) {
                characters[i] = 'x';
            }
        }

        return new String(characters);
    }

    public static double monteCarloPi() {
        int side = 10;
        int successes = 0;
        int trials = 1000000;

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