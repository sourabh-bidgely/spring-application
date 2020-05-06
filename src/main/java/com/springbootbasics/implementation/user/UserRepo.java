package com.springbootbasics.implementation.user;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserPg, UUID> {

}
