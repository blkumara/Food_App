package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.FoodDao;
import com.ty.food.dto.FoodOrder;
import com.ty.food.dto.Item;

public class FoodService {
	FoodDao dao = new FoodDao();

	public FoodOrder saveFood(FoodOrder foodOrder) {
		
		int sum = 0;
		for(Item item:foodOrder.getItems()) {
			sum += item.getCost()*(Tax.cgst+Tax.sgst);
			
		}
		foodOrder.setTotal(sum);
		return dao.saveFood(foodOrder);
	}

	public FoodOrder getOrderById( int id) {
		return dao.getOrderById(id);
	}

	public List<FoodOrder> getAllFoodOrder() {
		return dao.getAllFoodOrder();
	}

	public FoodOrder updateFoodOrderById(FoodOrder foodOrder, int id) {
		return dao.updateFoodOrderById(foodOrder);
	}

	public boolean deleteFoodOrderById(int id) {
		return dao.deleteFoodOrderById(id);
	}
	public List<FoodOrder> getFoodOrderByName(String name){
		return dao.getFoodOrderByName(name);
		
	}

}
