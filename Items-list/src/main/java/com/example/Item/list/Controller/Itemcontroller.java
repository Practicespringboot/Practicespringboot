package com.example.Item.list.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Item.list.model.Item;
import com.example.Item.list.service.ItemService;

@RestController
public class Itemcontroller {

	@Autowired
	ItemService service;

	@PostMapping("/saveItem")
	public Item save(@RequestBody Item item) {

		return service.saveItem(item);
	}

	@GetMapping("/getById/{id}")
	public Optional<Item> getById(@PathVariable String id) {
		return service.getById(id);
	}

	@GetMapping("/getAll")
	public List<Item> getAll() {
		return service.getAll();
	}

	@DeleteMapping("/deleteById/{id}")
	public void delete(@PathVariable String id) {
		service.deleteById(id);
	}

	@PutMapping("/update/{id}")
	public String save(@RequestBody Item item, @PathVariable String id) {
		return service.updateItem(item, id);
	}
}