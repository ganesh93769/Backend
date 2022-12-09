package com.p1;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;

import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, Long> 
{

    void delete(Booking booking);

    List findAll();

    Booking findById(int id);

    Booking save(Booking booking);
}