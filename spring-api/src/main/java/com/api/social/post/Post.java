package com.api.social.post;

import com.api.social.user.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Post {
    @Id
    private String id;

    private String postdate;

    @ManyToOne
    private User user;

    private String details;

    public Post(String id, String postdate, User user, String details) {
        this.id = id;

        this.postdate = postdate;

        this.user = user;

        this.details = details;
    }

    public Post() {

    }

    public String getId() {
        return id;
    }

    public String getPostdate() {
        return postdate;
    }

    public User getUser() {
        return user;
    }

    public String getDetails() {
        return details;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
