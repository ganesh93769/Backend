package com.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/apif"})

public class FeedbackController {

    @Autowired
    private FeedbackService FdService;

    @PostMapping(value="/feedback")
    public Feedback create(@RequestBody Feedback fd){
        return FdService.create(fd);
    }

    @GetMapping(path = {"/{id}"})
    public Feedback findOne(@PathVariable("id") int id){
        return FdService.findById(id);
    }

    @PutMapping
    public Feedback update(@RequestBody Feedback fd){
        return FdService.update(fd);
    }

    @DeleteMapping(path ={"/{id}"})
    public Feedback delete(@PathVariable("id") int id) {
        return FdService.delete(id);
    }

    @GetMapping(value="/feedbacks")
    public List findAll(){
        return FdService.findAll();
    }
}