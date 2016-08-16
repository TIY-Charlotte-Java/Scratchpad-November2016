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

    @Test
    public void longxReturnsLongestStringOfXs() {
        assertEquals(Main.longx("asdxxxxf"), 4);
        assertEquals(Main.longx("xa"), 1);
        assertEquals(Main.longx("xpxpxpxpxp"), 1);
        assertEquals(Main.longx("xxpxxxxxp"), 5);
    }

    @Test
    public void capitalizedReturnsNumberOfCapitalLettersInStrings() {
        assertEquals(Main.capitalized("Bass Hunter"), 2);
        assertEquals(Main.capitalized("ABCDEfghi"), 5);
        assertEquals(Main.capitalized("Mon Tues Wed"), 3);
    }

    @Test
    public void capitalizedStreamsReturnsNumberOfCapitalLettersInStrings() {
        assertEquals(Main.capitalizedStreams("Bass Hunter"), 2);
        assertEquals(Main.capitalizedStreams("ABCDEfghi"), 5);
        assertEquals(Main.capitalizedStreams("Mon Tues Wed"), 3);
    }

}