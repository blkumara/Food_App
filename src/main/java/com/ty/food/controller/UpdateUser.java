package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class UpdateUser {
	public static void main(String[] args) {
		
		User user = new User();
		UserService service = new UserService();
		if (user != null) {
			user.setId(2);
			user.setName("varun");
			user.setEmail("varun@gmail.com");
			user.setPassword("varun@9844");
			user.setPhone(7204509435l);
			service.updateUser(user, 1);
			System.out.println("Updated");

		} else {
			System.out.println("User Not found");
		}
	}
}
