package com.ty.food.controller;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class SaveUser {
	public static void main(String[] args) {
		// Save User
		User  user=new User();
		UserService service=new UserService();
		user.setName("Balaji");
		user.setEmail("balaji@gmail.com");
		user.setPassword("balaji@123");
		user.setPhone(8788587575l);
		service.saveFood(user);
		System.out.println("Saved");
	}
}
