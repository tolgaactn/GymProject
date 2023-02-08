package com.gym.gymProject.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MealList {

	private int id;
	private Meal meal;
	private Nutrition nutrition;
	private Double weight;
	private LocalDateTime createdDate;
}
