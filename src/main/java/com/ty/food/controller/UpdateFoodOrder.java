package com.ty.food.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodService;

public class UpdateFoodOrder {
	public static void main(String[] args) {
		
		FoodService foodService=new FoodService();
		FoodOrder foodOrder=new FoodOrder();
		foodOrder.setId(4);
		foodOrder.setName("Varun");
		foodOrder.setPhone(7204509435l);
		foodOrder.setTotal(0);
		
		Item item=new Item();
		item.setId(1);
		item.setName("Pizza");
		item.setQuantity(1);
		item.setCost(300);
		item.setFoodOrder(foodOrder);
		
		Item item1=new Item();
		item1.setId(2);
		item1.setName("Burger");
		item1.setQuantity(1);
		item1.setCost(100);
		item1.setFoodOrder(foodOrder);
		
		Item item2=new Item();
		item2.setId(3);
		item2.setName("Coco-cola");
		item2.setQuantity(2);
		item2.setCost(100);
		item2.setFoodOrder(foodOrder);
		
		List<Item>  items=new ArrayList();
		items.add(item);
		items.add(item1);
		items.add(item2);
		
		foodOrder.setItems(items);
		foodService.updateFoodOrderById(foodOrder, 4);
		
	}
}
