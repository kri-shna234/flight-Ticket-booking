package com.ibm.repository;

import org.springframework.data.repository.CrudRepository;

import com.ibm.model.Ticket;

public interface TicketRepository extends CrudRepository<Ticket,Integer>
{

}
