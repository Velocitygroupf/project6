package com.sb.project6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "model")
public class Model {
	
	
	@Id
	private int id;

}
