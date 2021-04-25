package com.co.cibernos.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.bind.Name;

@Entity
@Table(name = "jobs")
public class Jobs {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "job_id")
    private Integer id;
	
    private String name;
    
    private String description;
    
	public Jobs() {
		super();
	}

	public Jobs(Integer id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    
}
