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

    @Test
    public void silverReturnsTheSecondHighestNumberInAnArray() {
        assertEquals(Main.silver(new int[] { 1, 2, 3, 4, 5 }), 4);
        assertEquals(Main.silver(new int[] { -1, 50, 100, 47 }), 50);
    }

    @Test
    public void sleepInTellsUsWhenItsOkayToSleepIn() {
        assertTrue(Main.sleepIn(false, false));
        assertFalse(Main.sleepIn(true, false));
        assertTrue(Main.sleepIn(false, true));
    }

    @Test
    public void unsortedArrayThingDoesThings() {
        assertTrue(Main.unsortedOther(new int[] { 1, 2, 3 }, new int[] { 3, 2, 1 }));
        assertTrue(Main.unsortedOther(new int[] { 1, 8, 9 }, new int[] { 8, 9, 1 }));             // returns true
        assertTrue(Main.unsortedOther(new int[] { 5, 4, 3, 2, 1}, new int[] {4, 1, 3, 5, 2})); // returns true
        assertFalse(Main.unsortedOther(new int[] { 1, 2, 3 }, new int[] {4, 5, 6}));             // returns false
        assertFalse(Main.unsortedOther(new int[] { 1, 4, 6 }, new int[] {1, 6, 5}));
    }

    @Test
    public void whenBlendedPaintsAverageTheirColors() {
        assertEquals(Main.blend(new Color[] { new Color(255, 0, 0), new Color(0, 0, 255)}), new Color(127, 0, 127));
    }

    @Test
    public void whenBlendedPaintsAverageTheirColorsSimple() {
        assertEquals(
            new Color(127, 0, 127),
            Main.simpleBlend(new Color[] {
                    new Color(255, 0, 0),
                    new Color(0, 0, 255)
            })
        );
    }
}