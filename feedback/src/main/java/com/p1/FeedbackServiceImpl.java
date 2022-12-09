package com.p1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository fdRepository;

    @Override
    public Feedback create(Feedback fd) {
        return fdRepository.save(fd);
    }

    @Override
    public Feedback delete(int id) {
        Feedback fd = findById(id);
        if(fd != null){
            fdRepository.delete(fd);
        }
        return fd;
    }

    @Override
    public List<Feedback> findAll() {
        return fdRepository.findAll();
    }

    @Override
    public Feedback findById(int id) {
        return fdRepository.findById(id);
    }

	@Override
	public Feedback update(Feedback fd) {
		// TODO Auto-generated method stub
		return null;
	}

}