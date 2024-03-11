package com.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.models.UserMst;

public interface UserMstRepository extends MongoRepository<UserMst, Integer> {

	
}
