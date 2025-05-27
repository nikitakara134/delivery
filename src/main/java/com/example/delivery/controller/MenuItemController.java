package com.example.delivery.controller;


import com.example.delivery.model.MenuItem;
import com.example.delivery.service.MenuItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuItemController {
    private final MenuItemService menuItemService;

    public MenuItemController(MenuItemService menuItemService) {
        this.menuItemService = menuItemService;
    }

    @GetMapping("/{restaurantId}")
    public List<MenuItem> getMenuByRestaurantId(@PathVariable Long restaurantId) {
        return menuItemService.getMenuByRestaurantId(restaurantId);
    }

    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem menuItem) {
        return menuItemService.addMenuItem(menuItem);
    }
}