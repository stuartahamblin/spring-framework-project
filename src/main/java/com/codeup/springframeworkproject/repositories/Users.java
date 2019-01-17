package com.codeup.springframeworkproject.repositories;

import com.codeup.springframeworkproject.models.User;
import org.springframework.data.repository.CrudRepository;

public interface Users extends CrudRepository <User, Long> {
    User findByUsername(String username);
}
