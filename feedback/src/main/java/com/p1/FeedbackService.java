package com.p1;

import java.util.List;

public interface FeedbackService 
{
	public Feedback create(Feedback fd);
	public Feedback delete(int id);
	public List findAll();
	public Feedback findById(int id);
	public Feedback update(Feedback fd);
}
