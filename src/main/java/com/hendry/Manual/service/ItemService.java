package com.hendry.Manual.service;

import com.hendry.Manual.model.Item;
import com.hendry.Manual.repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired private ItemRepo itemRepo;

    public Item saveItem(Item item){
        return itemRepo.save(item);
    }
    public List<Item> saveItem(List<Item> item){
        return itemRepo.saveAll(item);
    }
    public List<Item> getItem(){
        return itemRepo.findAll();

    }
    public Item getItemBy(int id){
        return itemRepo.findById(id).orElse(null);
    }
    public Item getItemByName(String name){
        return itemRepo.findByName(name);

    }
    public  String deleteItem(int id){
        itemRepo.deleteById(id);
        return "product removed id"+ id;

    }
    public Item updateItem(Item item){
        Item existingItem=itemRepo.findById(item.getId()).orElse(null);
        existingItem.setName(item.getName());
        existingItem.setQuantity(item.getQuantity());
        existingItem.setPrice(item.getPrice());
        return itemRepo.save(existingItem);

    }
}
