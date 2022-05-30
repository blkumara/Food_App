package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class SaveMenu {
	public static void main(String[] args) {
		MenuService menuService=new MenuService();
		
		Menu menu=new Menu();
		menu.setName("Burger");
		menu.setCost(200);
		menu.setDescrpition("Taste Iss good");
		menu.setOffer("10%");
		menu.setType("Veg");
		menu.setImage("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.foodandwine.com%2Frecipes%2Fultimate-veggie-burgers&psig=AOvVaw22f7v5tq1cimVhSVmquiae&ust=1653575648694000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCOCVp8Dv-vcCFQAAAAAdAAAAABAJ");
		MenuService menuService1=new MenuService();
		menuService1.saveMenu(menu);
		
	}
}
