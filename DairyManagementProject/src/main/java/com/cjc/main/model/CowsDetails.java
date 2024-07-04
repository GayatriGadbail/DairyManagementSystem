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
@NoArgsConstructor
@AllArgsConstructor
public class CowsDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cowId;
	private String cowBreed;
	private int cowAge;
	@Lob
	@Column(length = 999999999)
	private byte[] cowImage;
	private int cowNumber;
	private float averageMilkQuantity;
	

}
