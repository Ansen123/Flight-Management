package com.nestdigital.FlightManagement.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class FlightModel {
    @Id
    @GeneratedValue
    private int id;
    private String flightName;
    private String destination;
    private int capacity;

    public FlightModel(int id, String flightName, String destination, int capacity) {
        this.id = id;
        this.flightName = flightName;
        this.destination = destination;
        this.capacity = capacity;
    }

    public FlightModel() {
    }

    public int getId() {
        return id;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
