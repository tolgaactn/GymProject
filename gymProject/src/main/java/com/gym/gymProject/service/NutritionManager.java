package com.gym.gymProject.service;

import com.gym.gymProject.model.Nutrition;
import com.gym.gymProject.repository.NutritionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NutritionManager implements NutritionService{

    private  NutritionRepository nutritionRepository;
    private NutritionManager nutritionManager;

     public NutritionManager(NutritionRepository nutritionRepository){
         this.nutritionRepository = nutritionRepository;

     }
    @Override
    public List<Nutrition> getAll() {
        return null;
    }
}
