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

    @Test
    public void boostProperlyIncrementsDigits() {
        assertEquals(230, Main.boost(129));
        assertEquals(50, Main.boost(49));
        assertEquals(523, Main.boost(412));
    }

    @Test
    public void boostAlternativeProperlyIncrementsDigits() {
        assertEquals(230, Main.boostAlternative(129));
        assertEquals(50, Main.boostAlternative(49));
        assertEquals(523, Main.boostAlternative(412));
    }

    @Test
    public void hoppityHopHopSimulator() {
        assertEquals(241, Main.cherokeeHare(150, .10, 5));
        assertEquals(2278, Main.cherokeeHare(300, .5, 5));
    }

    @Test
    public void velmaFlipsPancakesGood() {
        assertEquals(.8 * .8 * .8, Main.flipper(), .1);
    }

    @Test
    public void monteCarloPiTest() {
        assertEquals(3.14159, Main.monteCarloPi(), .02);
    }

    @Test
    public void weaverWeavesLettersIntoText() {
        assertEquals("xbcxefx", Main.weave("abcdefg", 3));
        assertEquals("xoxox", Main.weave("ooooo", 2));
    }

//    @Test
//    public void findingNemo() {
//        System.out.println(Main.nemo());
//    }

    @Test
    public void fibonacciSequenceGeneratorGeneratesValidFibonacciArrays() {
        assertArrayEquals(new int[] { 1, 1 }, Main.fibonacci(2));
        assertArrayEquals(new int[] { 1, 1, 2, 3, 5, 8, 13 }, Main.fibonacci(7));
        assertArrayEquals(new int[] { 1, 1, 2, 3, 5}, Main.fibonacci(5));
        assertArrayEquals(new int[] { 1 }, Main.fibonacci(1));
    }

    @Test
    public void climbClimbsAllTheThings() {
        assertArrayEquals(new int[] { 5, 6, 8}, Main.climb(5, 3));
        assertArrayEquals(new int[] { 8, 9, 11, 14, 18 }, Main.climb(8, 5));
        assertArrayEquals(new int[] { 1, 2, 4, 7}, Main.climb(1, 4));
    }

    @Test
    public void narcissisticNumbersAreNarcissistic() {
        assertTrue(Main.isNarcissistic(153));
        assertTrue(Main.isNarcissistic(1634));
    }

    @Test
    public void trainsCollideWithPeopleWhenTheyGoFaster() {
        Movable train = new Movable();
        train.speed = 100;
        train.position = 0;

        Movable person = new Movable();
        person.speed = 10;
        person.position = 200;

        assertEquals(222, Main.movableThingsCrash(train, person));
    }

    @Test
    public void roseBudCheatCalculator() {
        assertEquals(4, Main.rosebud("rosebud!!!!1"));
        assertEquals(1, Main.rosebud("rosebud!1"));
        assertEquals(0, Main.rosebud("rosebud1"));
    }

    @Test
    public void desirableHomesTest() {
        assertEquals(2, Main.desirable("RHHHH")); // returns 2
        assertEquals(3, Main.desirable("RHHHR")); // returns 3
        assertEquals(10, Main.desirable("RHRHRHRHRHRHRHRHRHRH"));
        assertEquals(10, Main.desirable("RHHHRHHHRHHHRH"));
        assertEquals(12, Main.desirable("HHHHHHHHHHHHHHRHHHRHHHRHHHRH"));
    }

    @Test
    public void heatColorsTest() throws Exception {
        assertEquals(new Color(0,   0, 255),   Main.heat(0));
        assertEquals(new Color(127, 0, 127),   Main.heat(50));
        assertEquals(new Color(255, 0, 0),     Main.heat(100));
    }

    @Test
    public void reverseTest() {
        assertEquals("neb",     Main.reverse("ben"));
        assertEquals("yesdnil", Main.reverse("lindsey"));
        assertEquals("ekim",    Main.reverse("mike"));
    }

    @Test
    public void reverseHalfTest() {
        assertEquals("neb",     Main.reverseHalf("ben"));
        assertEquals("yesdnil", Main.reverseHalf("lindsey"));
        assertEquals("ekim",    Main.reverseHalf("mike"));
    }

    @Test
    public void reverseHalfIntsTest() {
        assertEquals("neb",     Main.reverseHalfInts("ben"));
        assertEquals("yesdnil", Main.reverseHalfInts("lindsey"));
        assertEquals("ekim",    Main.reverseHalfInts("mike"));
    }
}