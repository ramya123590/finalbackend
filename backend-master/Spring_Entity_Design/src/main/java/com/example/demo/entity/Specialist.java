package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table(name = "specialist")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Specialist {
	@Id
	private String specialist;

}