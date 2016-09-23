package com.theironyard.charlotte.genericsreasoning;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 9/23/16.
 */
public class Main {
    public static <T extends Number> T returnAnObject(T input) {
        return input;
    }

    public static void main(String[] args) {
        PeopleMap pm = new PeopleMap();

        float x = returnAnObject(4.0f);

        List<String> things = new ArrayList<>();

        things.add("PAnts");
        pm.put("Ben", new Person());
    }
}
