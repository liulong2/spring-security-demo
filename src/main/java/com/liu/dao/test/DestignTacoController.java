package com.liu.dao.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
public class DestignTacoController {


    @GetMapping
    public String showDesignFrom(Model model) {
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "采集", Ingredient.Type.WRAP),
                new Ingredient("COTO", "采集", Ingredient.Type.WRAP),
                new Ingredient("GRBF", "采集", Ingredient.Type.PROTEIN),
                new Ingredient("CARN", "采集", Ingredient.Type.PROTEIN),
                new Ingredient("TMTO", "采集", Ingredient.Type.VEGGIES),
                new Ingredient("LETC", "采集", Ingredient.Type.VEGGIES),
                new Ingredient("CHED", "采集", Ingredient.Type.CHEESE)
        );
        Ingredient.Type[] types = Ingredient.Type.values();
        for (Ingredient.Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),filterByType(ingredients,type));
        }
//        model.addAttribute("design", new Taco());
        return "design";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients, Ingredient.Type type) {
        return ingredients.stream().filter(x -> x.getType().equals(type)).collect(Collectors.toList());
    }
}
