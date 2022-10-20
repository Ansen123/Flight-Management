package com.nestdigital.FlightManagement.controller;

import com.nestdigital.FlightManagement.Dao.FlightDao;
import com.nestdigital.FlightManagement.Model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.nio.file.Path;
import java.util.List;

@RestController
public class FlightController {
    @Autowired
    private FlightDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/flight",consumes = "application/json",produces = "application/json")
    public String flight(@RequestBody FlightModel flight){
        dao.save(flight);
        return "{status:'Success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<FlightModel> view(){
        return (List<FlightModel>)dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping("/delete")
    public String deleteFlight(@RequestBody FlightModel flight){
        dao.deleteById(flight.getId());
        return "{status:'Success'}";
    }
}
