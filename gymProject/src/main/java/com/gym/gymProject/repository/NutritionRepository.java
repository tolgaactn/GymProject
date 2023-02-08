package com.gym.gymProject.repository;

import com.gym.gymProject.model.Nutrition;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface NutritionRepository extends CrudRepository <Nutrition,Integer> {

    @Query("SELECT n FROM Nutrition n Where n.name LIKE %:nutritionName")
    String findByName(String nutritionName);
}
