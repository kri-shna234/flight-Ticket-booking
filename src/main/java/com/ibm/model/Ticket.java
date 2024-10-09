package com.ibm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ticket_details")
public class Ticket {
	@Id
	private Integer ticketNumber;
	private String name;
	private String source;
	private String destination;
	private String flight_name;
	private String flght_date;

}
