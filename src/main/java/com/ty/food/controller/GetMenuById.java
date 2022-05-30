package com.ty.food.controller;

import com.ty.food.dto.Menu;
import com.ty.food.service.MenuService;

public class GetMenuById {
	public static void main(String[] args) {
		
		MenuService menuService=new MenuService();
	    Menu menu=	menuService.getMenuById(1);
	    if(menu!=null)
	    {
	    	System.out.println("menu Id Is:"+menu.getId());
	    	System.out.println("menu Id Is:"+menu.getName());
	    	System.out.println("menu Id Is:"+menu.getCost());
	    	System.out.println("menu Id Is:"+menu.getDescrpition());
	    	System.out.println("menu Id Is:"+menu.getOffer());
	    	System.out.println("menu Id Is:"+menu.getType());
	    	System.out.println("menu Id Is:"+menu.getImage());
	    }
	    else {
	    	System.out.println("Menu Is Not Found");
	    }
	}
}
