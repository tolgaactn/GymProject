package com.gym.gymProject.controller;

import com.gym.gymProject.model.Nutrition;
import com.gym.gymProject.repository.NutritionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("nutrition")
public class NutritionsController {

    @Autowired
    private NutritionRepository nutritionRepository;
    private String createNutrition(@RequestParam String name){
        nutritionRepository.save(new Nutrition());
        return nutritionRepository.findByName(name)+ " ürünü başarıyla kaydedildi";
    }
    @GetMapping("nutrition")
    public List<Nutrition> getAllNutrition(){
        return (List<Nutrition>) nutritionRepository.findAll();
    }
}
