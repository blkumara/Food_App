package com.ty.food.service;

import java.util.List;

import com.ty.food.dao.ItemDao;
import com.ty.food.dto.Item;

public class ItemService {
	ItemDao dao = new ItemDao();

	public Item saveItem(Item item) {
		return dao.saveItem(item);
	}

	public Item getItemById(Item item, int id) {
		return dao.getItemById(id);
	}

	public List<Item> getAllItem() {
		return dao.getAllItem();
	}

	public Item updateItem(Item item, int id) {
		return dao.updateItem(item);
	}

	public boolean deleteFoodOrderById(int id) {
		return dao.deleteItem(id);
	}


}
