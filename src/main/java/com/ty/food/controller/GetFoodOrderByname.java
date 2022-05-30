package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;
import com.ty.food.service.FoodService;

public class GetFoodOrderByname {
	public static void main(String[] args) {
		FoodService foodService = new FoodService();

		List<FoodOrder> foodOrder = foodService.getFoodOrderByName("varun");
		if (!(foodOrder.isEmpty())) {

			for (FoodOrder foodList : foodOrder) {
				System.out.println("FoodOrder Id Is:" + foodList.getId());
				System.out.println("FoodOrder Name Is:" + foodList.getName());
				System.out.println("FoodOrder Phone Is:" + foodList.getPhone());
				System.out.println("FoodOrder Total Is:" + foodList.getTotal());
				System.out.println("***************");

				// Item item=foodOrder.
				for (Item item : foodList.getItems()) {
					System.out.println("Item Id Is:" + item.getId());
					System.out.println("Item Name Is:" + item.getName());
					System.out.println("Item Quantity Is:" + item.getQuantity());
					System.out.println("Item Cost Is:" + item.getCost());
					System.out.println("******************");
				}
			}
		}
	}
}
