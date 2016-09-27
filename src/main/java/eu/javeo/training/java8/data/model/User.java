package eu.javeo.training.java8.data.model;

import java.time.LocalDate;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final LocalDate registerDate;

    public User(String firstName, String lastName, String email, LocalDate registerDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.registerDate = registerDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + email + ") registered " + registerDate;
    }
}
