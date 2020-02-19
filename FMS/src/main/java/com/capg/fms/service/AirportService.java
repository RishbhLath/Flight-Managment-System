package com.capg.fms.service;

import java.util.ArrayList;
import java.util.List;

import com.capg.fms.dao.AirportDao;
import com.capg.fms.dto.Airport;
import com.capg.fms.exception.MyException;

public class AirportService {

	public List<Airport> viewAirportService() throws MyException
	{
		//List<Airport> listAirport = new ArrayList<Airport>();
		AirportDao airportDao=new AirportDao();
		List<Airport> listAirport=airportDao.viewAirportDao();
		if(listAirport.isEmpty())
		{
		    throw new MyException("OOps!! the database is empty.");
		}
		return listAirport;
	}
	
	public Airport viewAirportService(String airportCode) throws MyException {
		Airport result=null;
		
			AirportDao airportDao=new AirportDao();
			result=airportDao.viewAirportDao(airportCode);
		if(result==null) {
			throw new MyException("OOps!! there is no airport with the airport code you have mentioned.");
		}
		else
		{
			
			return result;
		}
	}
	
}
