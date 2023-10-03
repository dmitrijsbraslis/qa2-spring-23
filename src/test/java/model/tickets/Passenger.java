package model.tickets;

import org.apache.commons.lang3.RandomStringUtils;

public class Passenger {
    private String firstName;
    private String lastName;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Passenger() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
//        if (firstName.equals("random")) {
//            this.firstName = RandomStringUtils.randomAlphabetic(10);
//        } else {
//            this.firstName = firstName;
//        }

        this.firstName = firstName.equals("random") ? RandomStringUtils.randomAlphabetic(10) : firstName;
        //               |----------expression------|----------------true-------------------------|---false---|
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
