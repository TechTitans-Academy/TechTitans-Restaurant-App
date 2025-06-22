package com.example.dinner_menu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MenuController {

    @GetMapping("/menu")
    public String getMenu(Model model) {
        List<String> menuItems = Arrays.asList(
                "Grilled Chicken",
                "Caesar Salad",
                "Steak",
                "Mashed Potatoes",
                "Pasta Alfredo",
                "Garlic Bread",
                "Tiramisu"
        );
        model.addAttribute("menuItems", menuItems);
        return "menu"; // This maps to templates/menu.html
    }
}

