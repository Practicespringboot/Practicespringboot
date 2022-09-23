package com.example.Item.list.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Item.list.model.Item;
import com.example.Item.list.repo.ItemRepo;
@Service
public class ItemService {

	@Autowired
	ItemRepo repo;

	public Item saveItem(Item item) {
		return repo.save(item);
	}

	public Optional<Item> getById(String id) {
		return repo.findById(id);
	}

	public List<Item> getAll() {
		return repo.findAll();
	}

	public void deleteById(String id) {
		repo.deleteById(id);

	}
	public String updateItem(Item item,String id) {
	 Optional<Item>   it=getById(id);
	 repo.save(item);
	 if(it.isPresent()) {
		 return "UPDATED SUCCESSFULLY";
	 }
	 else {
		 return id+"NOT FOUND";
		 
	 }

				 
	 }

	
	
}
