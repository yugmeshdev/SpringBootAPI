package com.dailycodebuffer.Springboot.tutorial.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor //without arguments
@AllArgsConstructor
@Builder
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long departmentId;
	
	@NotBlank(message="Please add department Name")
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
	
	
	
}
