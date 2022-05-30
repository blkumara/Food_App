package com.ty.food.controller;

import com.ty.food.service.UserService;

public class DeleteUser {
	public static void main(String[] args) {

		UserService service = new UserService();
		boolean user = service.deleteUserById(5);
		if (user != false) {
			System.out.println("Delted");
		} else {
			System.out.println("user Is Not Found");
		}
	}
}
