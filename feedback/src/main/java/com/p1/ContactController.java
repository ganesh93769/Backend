package com.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/apic"})

public class ContactController {

    @Autowired
    private ContactService conService;

    @PostMapping(value="/contact")
    public Contact create(@RequestBody Contact con){
        return conService.create(con);
    }

    @GetMapping(path = {"/{id}"})
    public Contact findOne(@PathVariable("id") int id){
        return conService.findById(id);
    }

    @PutMapping
    public Contact update(@RequestBody Contact con){
        return conService.update(con);
    }

    @DeleteMapping(path ={"/{id}"})
    public Contact delete(@PathVariable("id") int id) {
        return conService.delete(id);
    }

    @GetMapping(value="/contacts")
    public List findAll(){
        return conService.findAll();
    }
}