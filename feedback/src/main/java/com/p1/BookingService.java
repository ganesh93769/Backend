package com.p1;

import java.util.List;

public interface BookingService 
{
	public Booking create(Booking booking);
	public Booking createu(Booking booking);
	public Booking delete(int id);
	public List findAll();
	public Booking findById(int id);
	public Booking update(Booking booking);
}
