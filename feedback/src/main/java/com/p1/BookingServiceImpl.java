package com.p1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository repository;

    @Override
    public Booking create(Booking booking) {
        return repository.save(booking);
    }

    @Override
    public Booking delete(int id) {
        Booking booking = findById(id);
        if(booking != null){
            repository.delete(booking);
        }
        return booking;
    }

    @Override
    public List<Booking> findAll() {
        return repository.findAll();
    }

    @Override
    public Booking findById(int id) {
        return repository.findById(id);
    }

    @Override
    public Booking update(Booking booking) {
        return null;
    }

	@Override
	public Booking createu(Booking booking) {
		// TODO Auto-generated method stub
		return repository.save(booking);
	}
}