package com.cjc.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BuffaloDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int buffaloId;
	private String buffaloBreed;
	private int buffaloAgr;
	@Lob
	@Column(length = 999999999)
	private byte[] buffaloImage;
	private int buffaloNumber;
	private float averageMilkQuantity;
	

}
