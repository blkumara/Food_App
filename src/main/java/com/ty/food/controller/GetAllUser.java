package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.User;
import com.ty.food.service.UserService;

public class GetAllUser {
	public static void main(String[] args) {
		
		UserService service = new UserService();
		List<User>  list=service.getAllUser();
		for (User user : list) {
			System.out.println("User Id Is:" + user.getId());
			System.out.println("User Id Is:" + user.getName());
			System.out.println("User Id Is:" + user.getEmail());
			System.out.println("User Id Is:" + user.getPassword());
			System.out.println("User Id Is:" + user.getPhone());
			System.out.println("*******************");
		}
	}

}
