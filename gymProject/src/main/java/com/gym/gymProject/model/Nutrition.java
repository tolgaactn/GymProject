package com.gym.gymProject.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter

@Table(name = "nutritions")
public class Nutrition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;

    @Column(name = "name")
	private String name;

    @Column(name ="kcal")
    private Double kcal;
	@Column(name= "protein")
	private Double protein;

	@Column(name="carbohydrate")
	private Double carbohydrate;
	@Column(name="fat")
	private Double fat;


}
