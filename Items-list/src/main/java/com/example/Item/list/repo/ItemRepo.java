package com.example.Item.list.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Item.list.model.Item;
@Repository
public interface ItemRepo  extends JpaRepository<Item, String>{

}
