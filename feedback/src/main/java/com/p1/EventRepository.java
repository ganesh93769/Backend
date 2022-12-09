package com.p1;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> 
{

    void delete(Event event);

    List findAll();

    Event findById(int id);

    Event save(Event user);
}