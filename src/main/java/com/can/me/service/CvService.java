package com.can.me.service;

import com.can.me.model.Cv;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CvService {
    public Cv create(Cv cv);
    public Cv update(Cv cv);
    public void delete(long id);
    public Cv getById(long id);
    public List<Cv> getAll();
}
