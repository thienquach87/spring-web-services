package com.api.social.location;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
    @Id
    private String id;

    private String city;

    private String country;

    public Location(String id, String city, String country) {
        this.id = id;
        this.city = city;
        this.country = country;
    }

    public Location() {

    }

    public String getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
