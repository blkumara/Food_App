package com.ty.food.controller;

import java.util.List;

import com.ty.food.dto.FoodOrder;
import com.ty.food.service.FoodService;

public class GetAllFoodOrder {
	public static void main(String[] args) {
		FoodService foodService = new FoodService();
		List<FoodOrder> list = foodService.getAllFoodOrder();
		for (FoodOrder foodOrder : list) {

			System.out.println("FoodOrder Id Is:" + foodOrder.getId());
			System.out.println("FoodOrder Name Is:" + foodOrder.getName());
			System.out.println("FoodOrder Phone Is:" + foodOrder.getPhone());
			System.out.println("FoodOrder Total Is:" + foodOrder.getTotal());
			System.out.println("***************");

		}
	}
}
