package com.cjc.main.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class FarmerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int farmerId;
	private String farmerName;
	private long farmerContactNo;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<CowsDetails> cd=new HashSet<>();
	@OneToMany(cascade = CascadeType.ALL)
	private Set<BuffaloDetails> bd=new HashSet<>();
	

}
