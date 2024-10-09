package com.ibm.repository;

import org.springframework.data.repository.CrudRepository;

import com.ibm.model.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger,Integer>
{

}
