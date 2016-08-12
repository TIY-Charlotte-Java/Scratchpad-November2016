package com.theironyard.charlotte;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ben on 8/11/16.
 */
public class MainTest {
    @Test
    public void gimmeReturnsValidInts() {
        int randomInt = Main.gimme(new int[] { 5, 1, 7 });
        assertTrue(randomInt == 5 || randomInt == 1 || randomInt == 7);

        randomInt = Main.gimme(new int[] { 232, 23483, -285 });
        assertTrue(randomInt == 232 || randomInt == 23483 || randomInt == -285);
    }

    @Test
    public void balancedReturnsAppropriateBooleans() {
        assertTrue(Main.balanced("abbt", 'b'));
        assertTrue(Main.balanced("prrt", 'r'));
        assertTrue(Main.balanced("wowx", 'w'));

        assertFalse(Main.balanced("creek", 'e'));
    }

}