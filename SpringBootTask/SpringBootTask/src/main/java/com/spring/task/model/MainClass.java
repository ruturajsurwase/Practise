package com.spring.task.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MainClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	@OneToOne(cascade = CascadeType.ALL)
	private Meta meta;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Data> data;

}
