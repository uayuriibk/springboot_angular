package com.springboot_angular.controller;

import com.springboot_angular.model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    private List<Item> items = createList();

    @GetMapping("/items")
    public List<Item> firstPage() {
        return items;
    }

    private static List<Item> createList() {

        List<Item> items = new ArrayList<>();

        Item item1 = new Item();
        item1.setTitle("item1");
        item1.setDescription("My 1st item");
        item1.setId(1);
        item1.setQuantity(1);

        Item item2 = new Item();
        item2.setTitle("item2");
        item2.setDescription("My 2nd item");
        item2.setId(2);
        item2.setQuantity(2);

        items.add(item1);
        items.add(item2);
        return items;
    }
}
