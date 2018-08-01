package com.can.me.controller;

import com.can.me.model.Cv;
import com.can.me.model.Information;
import com.can.me.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InformationController {

    private InformationService informationService;

    @Autowired
    public InformationController(InformationService informationService){
        this.informationService  = informationService;
    }

    @GetMapping("/cv/{cvId}/info")
    public List<Information> getAllByCvId(@PathVariable long cvId){
        return informationService.getAllByCvId(cvId);
    }

    @GetMapping("/info/{id}")
    public Information getById(@PathVariable long id){
        return informationService.getById(id);
    }

    @GetMapping("/info")
    public List<Information> getAll(){
        return informationService.getAll();
    }

    @PostMapping("/cv/{cvId}/info")
    public Information add(@RequestBody Information information, @PathVariable long cvId){
        Cv cv = new Cv();
        cv.setId(cvId);
        information.setCv(cv);
        return informationService.create(information);
    }
}