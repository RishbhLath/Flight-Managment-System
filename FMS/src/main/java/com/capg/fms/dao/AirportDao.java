package com.capg.fms.dao;

import java.util.List;

import com.capg.fms.dto.Airport;
import com.capg.fms.exception.MyException;
import com.capg.fms.util.AirportRepositary;

public class AirportDao {
 
	public List<Airport> viewAirportDao()
	{
		List<Airport> listAirport=AirportRepositary.getAirportList();
		return listAirport;
	}
	
	public Airport viewAirportDao(String airportCode) throws MyException {
		List<Airport> listAirport=AirportRepositary.getAirportList();
		for(Airport airport:listAirport) {
			if(airport.getAirportCode().equalsIgnoreCase(airportCode)){
				//System.out.println(airport.toString());
				return airport;
			}
		}
		return null;
	}
}
