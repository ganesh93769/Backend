package com.p1;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.Repository;

import java.util.List;

public interface FeedbackRepository extends CrudRepository<Feedback, Long> 
{

    void delete(Feedback fd);

    List findAll();

    Feedback findById(int id);

    Feedback save(Feedback fd);
}