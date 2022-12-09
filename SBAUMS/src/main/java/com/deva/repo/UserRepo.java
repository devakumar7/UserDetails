package com.deva.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deva.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> 
{}
