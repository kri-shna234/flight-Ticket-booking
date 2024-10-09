package com.ibm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "passenger")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer serial;
	private String name;
	private String source;
	private String destination;
	private String flight_name;
	private String flght_date;

}
