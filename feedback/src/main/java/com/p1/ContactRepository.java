package com.p1;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Long> 
{

    void delete(Contact user);

    List findAll();

    Contact findById(int id);

    Contact save(Contact user);
}