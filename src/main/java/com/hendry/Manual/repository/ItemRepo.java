package com.hendry.Manual.repository;

import com.hendry.Manual.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Integer> {
    Item findByName(String name);
}
