package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.UserMstRepository;
import com.demo.models.UserMst;

@RestController
public class UserMstController {

	@Autowired
	private UserMstRepository userRepo;

	@PostMapping("/addUser")
	public ResponseEntity<?> addUser(@RequestBody UserMst userMst) {

		UserMst user = userRepo.save(userMst);
		return ResponseEntity.ok(user);
		

	}

	@GetMapping("/getUser")
	public ResponseEntity<?> getUser() {

		List<UserMst> user = userRepo.findAll();
		return ResponseEntity.ok(user);
		

	}
}
