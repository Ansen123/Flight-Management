package com.nestdigital.FlightManagement.Dao;

import com.nestdigital.FlightManagement.Model.FlightModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {


    @Query(value = "SELECT `id`, `capacity`, `destination`, `flight_name` FROM `flight` WHERE  flight_name =:flight_name",nativeQuery = true)
    List<FlightModel>searchFlight(String flight_name);
}
