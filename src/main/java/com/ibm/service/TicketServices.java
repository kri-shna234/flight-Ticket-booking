package com.ibm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.model.Passenger;
import com.ibm.model.Ticket;
import com.ibm.repository.PassengerRepository;
import com.ibm.repository.TicketRepository;

@Service
public class TicketServices {
	@Autowired
	private PassengerRepository passengerRepo;
	@Autowired
	private TicketRepository ticketRepo;

	public Ticket book(Passenger p) {
		if (p != null) {
			Passenger passenger = passengerRepo.save(p);
			System.out.println(passenger);
			int randomNum = (int) (Math.random() * 101);
			Ticket tic = new Ticket();
			tic.setTicketNumber(randomNum);
			tic.setName(passenger.getName());
			tic.setSource(passenger.getSource());
			tic.setDestination(passenger.getDestination());
			tic.setFlight_name(passenger.getFlight_name());
			tic.setFlght_date(passenger.getFlght_date());
			Ticket ticket = ticketRepo.save(tic);
			System.out.println(ticket);
			return ticket;
		} 
		else
			return null;
	}
	public Ticket getTicket(Integer ticNumber)
	{
		if(ticNumber != null)
		{
			Optional<Ticket> ticket = ticketRepo.findById(ticNumber);
			if(ticket.isPresent())
			{
				return ticket.get();
			}
			else
				return null;
		}
		else
			return null;
	}
}
