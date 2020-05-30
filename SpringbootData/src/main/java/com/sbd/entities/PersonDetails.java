package com.sbd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PersonDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int person_id;
	@Column
	private String person_name;
	@Column
	private int person_age;
	@Column
	private char person_gender;
	@Column
	private String person_state;
	@Column
	private String person_country;

}
