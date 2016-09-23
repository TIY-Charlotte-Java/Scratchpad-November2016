package com.theironyard.charlotte;

import java.util.List;

/**
 * Created by Ben on 9/13/16.
 */
public class Table {
    private List<Attendee> sitters;

    public static final int MAX_ATTENDEES = 10;

    public Table() {
    }

    public Table(List<Attendee> sitters) {
        this.sitters = sitters;
    }

    public List<Attendee> getSitters() {
        return sitters;
    }

    public void setSitters(List<Attendee> sitters) {
        this.sitters = sitters;
    }
}
