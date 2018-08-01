package com.can.me.controller;

import com.can.me.model.Cv;
import com.can.me.service.CvService;
import com.can.me.service.impl.CvServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cv")
public class CvController {

    private final CvServiceImpl cvService;

    @Autowired
    public CvController(CvServiceImpl cvService) {
        this.cvService = cvService;
    }

    @GetMapping
    public List<Cv> getAll(){
        return cvService.getAll();
    }

    @GetMapping("/{id}")
    public Cv get(@PathVariable long id){
        return cvService.getById(id);
    }

    @PostMapping
    public Cv add(@RequestBody Cv cv){
        return cvService.create(cv);
    }

    @PutMapping
    public Cv edit(@RequestBody Cv cv){
        return cvService.update(cv);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id){
        cvService.delete(id);
    }
}
