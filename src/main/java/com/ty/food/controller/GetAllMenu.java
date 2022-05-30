package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class GetAllMenu {
	public static void main(String[] args) {
		
		MenuService menuService=new MenuService();
		List<Menu> list=menuService.getAllmenu();
		for (Menu menu : list) {
		  	System.out.println("menu Id Is:"+menu.getId());
	    	System.out.println("menu Id Is:"+menu.getName());
	    	System.out.println("menu Id Is:"+menu.getCost());
	    	System.out.println("menu Id Is:"+menu.getDescrpition());
	    	System.out.println("menu Id Is:"+menu.getOffer());
	    	System.out.println("menu Id Is:"+menu.getType());
	    	System.out.println("menu Id Is:"+menu.getImage());
			
		}
	    
	}
}
