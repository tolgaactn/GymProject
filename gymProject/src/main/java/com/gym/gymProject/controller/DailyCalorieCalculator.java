package com.gym.gymProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculators")
public class DailyCalorieCalculator {


    @GetMapping("/calculateCalories")
    public String calculateCalories(@RequestParam double weight,
                                    @RequestParam double height,
                                    @RequestParam int age,
                                    @RequestParam double activityLevel) {

        double bmr = 0;
        bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        double dailyCalorieIntake = bmr * activityLevel;

        return "Your daily calorie intake is " + dailyCalorieIntake + " calories.";
    }
}

