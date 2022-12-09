package com.p1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository repository;

    @Override
    public Contact create(Contact con) {
        return repository.save(con);
    }

    @Override
    public Contact delete(int id) {
        Contact con = findById(id);
        if(con != null){
            repository.delete(con);
        }
        return con;
    }

    @Override
    public List<Contact> findAll() {
        return repository.findAll();
    }

    @Override
    public Contact findById(int id) {
        return repository.findById(id);
    }

    @Override
    public Contact update(Contact con) {
        return null;
    }
}