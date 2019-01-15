package com.codeup.springframeworkproject.repositories;

import com.codeup.springframeworkproject.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
