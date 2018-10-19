package com.java.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@DiscriminatorValue("M")
public class Manager extends Employee{

	private float budget;
	private String projectName;
	
	public Manager(String name, int employeeId, String companyName, float budget, String projectName) {
		super(name, employeeId, companyName);
		this.budget= budget;
		this.projectName= projectName;
	}
}
