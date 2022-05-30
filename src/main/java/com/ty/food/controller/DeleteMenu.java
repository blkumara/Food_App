package com.ty.food.controller;

import com.ty.food.service.MenuService;

public class DeleteMenu {
public static void main(String[] args) {
	
	MenuService menuService=new MenuService();

	boolean menu=menuService.deleteMenuById(2);
	if(menu!=false) {
		System.out.println("Deleted");
	}
	else {
		System.out.println("Menu Is Not found");
	}
}
}
