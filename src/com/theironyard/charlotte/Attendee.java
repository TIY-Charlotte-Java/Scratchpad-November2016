package com.theironyard.charlotte;

/**
 * Created by Ben on 9/13/16.
 */
public class Attendee {
    private String firstName;
    private String lastName;
    private String foodChoice;

    public Attendee() {
    }

    public Attendee(String firstName, String lastName, String foodChoice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.foodChoice = foodChoice;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFoodChoice() {
        return foodChoice;
    }

    public void setFoodChoice(String foodChoice) {
        this.foodChoice = foodChoice;
    }
}
