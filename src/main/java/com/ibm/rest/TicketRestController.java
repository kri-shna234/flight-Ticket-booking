package com.ibm.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.model.Passenger;
import com.ibm.model.Ticket;
import com.ibm.service.TicketServices;

@RestController
public class TicketRestController {
	@Autowired
	private TicketServices ticService;

	@PostMapping("/bookTicket")
	public Ticket bookTicket(@RequestBody Passenger p) {
		Ticket ticket = ticService.book(p);
		return ticket;
	}
	@GetMapping("/getTicket/{ticketNumber}")
	public Ticket getTicket(@PathVariable Integer ticketNumber)
	{
		Ticket ticket = ticService.getTicket(ticketNumber);
		return ticket;
	}
}
