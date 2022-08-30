package com.api.social.user;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
    public List<User> findUserByLocationId(String id);
}
