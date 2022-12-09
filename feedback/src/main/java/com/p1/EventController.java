package com.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/apie"})

public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping(value="/event")
    public Event create(@RequestBody Event event){
        return eventService.create(event);
    }
    @PostMapping(value="/eventu")
    public Event createu(@RequestBody Event event){
        return eventService.create(event);
    }

    @GetMapping(path = {"/{id}"})
    public Event findOne(@PathVariable("id") int id){
        return eventService.findById(id);
    }

//    @PutMapping
//    public Event update(@RequestBody Event event){
//        return eventService.update(event);
//    }

    @DeleteMapping(path ={"/{id}"})
    public Event delete(@PathVariable("id") int id) {
        return eventService.delete(id);
    }

    @GetMapping(value="/events")
    public List findAll(){
        return eventService.findAll();
    }
}