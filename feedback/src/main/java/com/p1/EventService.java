package com.p1;

import java.util.List;

public interface EventService 
{
	public Event create(Event event);
	public Event createu(Event event);
	public Event delete(int id);
	public List findAll();
	public Event findById(int id);
	public Event update(Event event);
}
