package com.springboot_angular.model;

import lombok.Data;

@Data
public class Item {
    private int id;
    private String title;
    private String description;
    private int quantity;
}
