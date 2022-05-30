package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class ValidateUser {
	public static void main(String[] args) {
		
		UserService service = new UserService();
		User user = service.validateUser("kumara@gmail.com", " kumara@9844");
		if (user != null) {
			System.out.println("User Id Is:" + user.getId());
			System.out.println("User Id Is:" + user.getName());
			System.out.println("User Id Is:" + user.getEmail());
			System.out.println("User Id Is:" + user.getPassword());
			System.out.println("User Id Is:" + user.getPhone());
		} else {
			System.out.println("Invalid User Email And Password");
		}

	}
}
