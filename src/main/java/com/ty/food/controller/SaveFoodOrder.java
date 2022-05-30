package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodService;
import com.ty.food.service.ItemService;

public class SaveFoodOrder {
	public static void main(String[] args) {
		
		FoodOrder foodOrder=new FoodOrder();
		FoodService foodService=new FoodService();
		ItemService itemService=new  ItemService();
		
	foodOrder.setName("Varun");
	foodOrder.setPhone(7204509435l);
	foodOrder.setTotal(0);
		
		Item item=new Item();
		item.setName("Burger");
		item.setQuantity(2);
		item.setCost(200);
		item.setFoodOrder(foodOrder);
		
		Item item1=new Item();
		item1.setName("French fries");
		item1.setQuantity(1);
		item1.setCost(100);
		item1.setFoodOrder(foodOrder);
		
		Item item2=new Item();
		item2.setName("Pepsi");
		item2.setQuantity(1);
		item2.setCost(50);
		item2.setFoodOrder(foodOrder);
	
		List<Item>  items=new ArrayList();
		items.add(item);
		items.add(item1);
		items.add(item2);
		
		foodOrder.setItems(items);
		foodService.saveFood(foodOrder);
		itemService.saveItem(item);
		itemService.saveItem(item1);
		itemService.saveItem(item2);
		
		System.out.println("Done");
	}

}
