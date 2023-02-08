package com.gym.gymProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@AllArgsConstructor
public class UserInfo {

	private int id;
	private User user;
	private Integer lenght;
	private Double weight;
	private int age;
	
}
