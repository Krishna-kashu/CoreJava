package com.myworks.greendress.controller;

import com.myworks.greendress.dto.FruitDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class FruitController {
    public FruitController(){
        System.out.println("Fruit Controller");
    }

//    public String onSubmit(@RequestParam String fruitName,
//                           @RequestParam String color,
//                           @RequestParam String taste,
//                           @RequestParam String season,
//                           @RequestParam String price,
//                           @RequestParam String origin,
//                           @RequestParam String vitamin,
//                           @RequestParam String seed,
//                           @RequestParam String life,
//                           @RequestParam String dish,          Model model){
//        System.out.println("onSubmit FruitController");
//
//
//        model.addAttribute("fruitName", fruitName);
//        model.addAttribute("color", color);
//        model.addAttribute("taste", taste);
//        model.addAttribute("season", season);
//        model.addAttribute("price", price);
//        model.addAttribute("origin", origin);
//        model.addAttribute("vitamin", vitamin);
//        model.addAttribute("seed", seed);
//        model.addAttribute("life", life);
//        model.addAttribute("dish", dish);
//
//
//        System.out.println("FruitName: " + fruitName +
//                ", Color: " + color + ", Taste: "
//                + taste + ", Season: " + season + ", Price: " +
//                price + ", Origin: " + origin + ", Vitamin: " + vitamin +
//                ", Seed: " + seed + ", Life: " + life +
//                ", Dish: " + dish);
//
//        return "result.jsp";
//    }
    @RequestMapping("/submitFruit")
    public String send(FruitDTO fruitDTO, Model model){
        System.out.println("onSubmit FruitController");
        model.addAttribute("fruitDTO", fruitDTO);

        System.out.println("FruitName: " + fruitDTO);
        return "result.jsp";
    }
}
