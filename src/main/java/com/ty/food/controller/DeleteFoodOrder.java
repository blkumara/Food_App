package com.ty.food.controller;

import com.ty.food.service.FoodService;

public class DeleteFoodOrder {
	public static void main(String[] args) {
		FoodService foodService = new FoodService();

		boolean foodOrder1 = foodService.deleteFoodOrderById(4);
		if(foodOrder1 != false)
		{
			System.out.println("Deleted successfully");
		} else {
			System.out.println("no data is found");
		}
	}
}
