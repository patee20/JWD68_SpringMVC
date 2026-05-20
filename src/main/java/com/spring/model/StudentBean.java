package com.spring.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentBean {
	
	//private int id;
	
	@NotNull
	private Integer id;
	
	@NotEmpty
	private String name;
	
	//private int age;
	
	@Range(max = 90, min=18)
	@NotNull
	private Integer age;

}
