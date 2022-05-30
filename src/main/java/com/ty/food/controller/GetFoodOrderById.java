package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodService;

public class GetFoodOrderById {
	
	public static void main(String[] args) {
		
		FoodService foodService=new FoodService();
		Item item=new Item();
		FoodOrder foodOrder=foodService.getOrderById( 4);
		if(foodOrder!=null) {
			List<Item> items=foodOrder.getItems();
			System.out.println("FoodOrder Id Is:"+foodOrder.getId());
			System.out.println("FoodOrder Name Is:"+foodOrder.getName());
			System.out.println("FoodOrder Phone Is:"+foodOrder.getPhone());
			System.out.println("FoodOrder Total Is:"+foodOrder.getTotal());
			System.out.println("***************");
			
			for (Item item1 : items) {
				System.out.println("Item Id Is:"+item1.getId());
				System.out.println("Item Name Is:"+item1.getName());
				System.out.println("Item Quantity Is:"+item1.getQuantity());
				System.out.println("Item Cost Is:"+item1.getCost());
				System.out.println("******************");
			}
			
	}
	}

}
