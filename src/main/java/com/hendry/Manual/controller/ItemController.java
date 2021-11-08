package com.hendry.Manual.controller;

import com.hendry.Manual.model.Item;
import com.hendry.Manual.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ItemController {
    @Autowired public ItemService itemService;

    @PostMapping("/addItem")
    public Item addItem(@RequestBody Item item){
        return itemService.saveItem(item);

    }
    @PostMapping("/addItems")
    public List<Item> addItem(@RequestBody List<Item> item){
        return itemService.saveItem(item);

    }
    @GetMapping("/products")
    public List<Item> findAllItems(){
        return itemService.getItem();
    }
    @GetMapping("/products{id}")
    public Item findItemById(@PathVariable int id){
        return itemService.getItemBy(id);
    }
    @GetMapping("/products{name}")
    public Item findItemByName(@PathVariable String name){
        return itemService.getItemByName(name);
    }
    @PutMapping("/update")
    public Item updateItem(@RequestBody Item item){
        return itemService.saveItem(item);
    }
    @DeleteMapping("/delete{id}")
    public String deleteItem(int id){
        return itemService.deleteItem(id);
    }
}
