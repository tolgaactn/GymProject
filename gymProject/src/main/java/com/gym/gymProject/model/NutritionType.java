package com.gym.gymProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="NutritionType")
public class NutritionType {
	@Id
	@Column(name="id")
	private int id;

	@Column(name="name")
	private String name;
	
}
