package com.can.me.service.impl;

import com.can.me.model.Cv;
import com.can.me.repository.CvRepository;
import com.can.me.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CvServiceImpl implements CvService {

    private final CvRepository cvRepository;

    @Autowired
    public CvServiceImpl(CvRepository cvRepository) {
        this.cvRepository = cvRepository;
    }

    @Override
    public Cv create(Cv cv) {
        return cvRepository.save(cv);
    }

    @Override
    public Cv update(Cv cv) {
        return cvRepository.save(cv);
    }

    @Override
    public void delete(long id) {
        cvRepository.deleteById(id);
    }

    @Override
    public Cv getById(long id) {
        return cvRepository.getOne(id);
        //return cvRepository.findById(id).filter(cv -> cv.getId().equals(id)).get();
    }

    @Override
    public List<Cv> getAll() {
        return cvRepository.findAll();
    }
}
