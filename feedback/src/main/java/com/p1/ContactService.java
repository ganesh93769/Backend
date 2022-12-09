package com.p1;

import java.util.List;

public interface ContactService 
{
	public Contact create(Contact con);
	public Contact delete(int id);
	public List findAll();
	public Contact findById(int id);
	public Contact update(Contact con);
}
