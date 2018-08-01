package com.can.me.service.impl;

import com.can.me.model.Information;
import com.can.me.repository.InformationRepository;
import com.can.me.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {

    private InformationRepository informationRepository;

    @Autowired
    public InformationServiceImpl(InformationRepository informationRepository) {
        this.informationRepository = informationRepository;
    }


    @Override
    public Information create(Information information) {
        return informationRepository.save(information);
    }

    @Override
    public Information update(Information information) {
        return informationRepository.save(information);
    }

    @Override
    public void delete(Information information) {
        informationRepository.delete(information);
    }

    @Override
    public Information getById(long id) {
        return informationRepository.getOne(id);
    }

    @Override
    public List<Information> getAllByCvId(long id){
        return informationRepository.findAllByCvId(id);
    }

    @Override
    public List<Information> getAll() {
        return informationRepository.findAll();
    }
}
