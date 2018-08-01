package com.can.me.service;


import com.can.me.model.Information;
import org.springframework.stereotype.Service;

import java.util.List;


public interface InformationService {
    public Information create(Information information);
    public Information update(Information information);
    public void delete(Information information);
    public Information getById(long id);
    public List<Information> getAllByCvId(long id);
    public List<Information> getAll();
}
