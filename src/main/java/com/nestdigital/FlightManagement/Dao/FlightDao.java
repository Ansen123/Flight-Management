package com.nestdigital.FlightManagement.Dao;

import com.nestdigital.FlightManagement.Model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
}
