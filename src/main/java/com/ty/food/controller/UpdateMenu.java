package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class UpdateMenu {
	public static void main(String[] args) {
		MenuService menuService=new MenuService();
		Menu menu=new Menu();
		menu.setId(1);
		menu.setName("Pepsi");
		menu.setCost(70);
		menu.setDescrpition("Juice Is Nice");
		menu.setOffer("25%");
		menu.setType("Juice");
		menu.setImage("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.jiomart.com%2Fp%2Fgroceries%2Fpepsi-250-ml-can%2F490916734&psig=AOvVaw1-_s773UB1h4Y27UySgDTI&ust=1653577118939000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCNjXo_r0-vcCFQAAAAAdAAAAABAD");
		menuService.updateMenu(menu, 1);
		System.out.println("Updated Successfully");
		
		
	}
}
