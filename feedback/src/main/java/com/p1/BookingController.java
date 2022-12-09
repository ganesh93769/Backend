package com.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/apib"})

public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping(value ="/booking")
    public Booking create(@RequestBody Booking booking){
        return bookingService.create(booking);
    }
    @PostMapping(value ="/bookingu")
    public Booking createu(@RequestBody Booking booking){
        return bookingService.create(booking);
    }

//    @GetMapping(path = {"/{id}"})
//    public Booking findOne(@PathVariable("id") int id){
//        return bookingService.findById(id);
//    }

//    @PutMapping(path = {"/book"})
//    public Booking update(@RequestBody Booking booking){
//        return bookingService.update(booking);
//    }

    @DeleteMapping(path ={"/{id}"})
    public Booking delete(@PathVariable("id") int id) {
        return bookingService.delete(id);
    } 

    @GetMapping(value="/bookings")
    public List findAll(){
        return bookingService.findAll();
    }
}