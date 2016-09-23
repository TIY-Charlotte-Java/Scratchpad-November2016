package com.theironyard.charlotte.lottery;

import java.util.*;

/**
 * Created by Ben on 9/23/16.
 */
public class Lottery {
    private static Map<String, Integer> guesses = new HashMap<>();

    public static void guess(String name, int guess) {
        // register a guess with the lottery
        // aka like, buy a ticket.
        guesses.put(name, guess);
    }

    public static void pick() {
        // generate a random number between 1 - 25
        int test = (int)(Math.random() * 25) + 1;
        Set<String> winners = new HashSet<>();

        // if a user has picked that number, say the user won.
        // otherwise, say Nobody win. :(
        guesses.forEach((key, value) -> {
            if (value == test) {
                winners.add(key);
            }
        });

        if (winners.size() > 0) {
            winners.forEach(winner -> {
                System.out.printf("%s is a winner!\n", winner);
            });
        } else {
            System.out.printf("Nobody picked a winning number. (%d)\n", test);
        }
    }

    public static void main(String[] args) {
        // make like five guesses, right
        guess("Ben", 15);
        guess("Mike", 2);
        guess("Lindsey", 7);

        // and then, let's just run the lottery
        // like 25 times.
        for (int i = 0;i < 25;i++) {
            pick();
        }
    }
}
