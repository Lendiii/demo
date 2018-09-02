package com.example.Model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter
@Setter
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private UUID id;
	
	@Column
	private String name;
	
	@Column
	private String email;

}
