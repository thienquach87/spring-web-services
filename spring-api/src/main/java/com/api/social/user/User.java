package com.api.social.user;

import com.api.social.location.Location;

import javax.persistence.*;

@Entity
@Table(name = "user_account")
public class User {
    @Id
    private String id;

    private String firstName;

    private String lastName;
    @ManyToOne
    private Location location;

    private String email;

    public User(String id, String firstName, String lastName, Location location, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.email = email;
    }

    public User() {

    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Location getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
