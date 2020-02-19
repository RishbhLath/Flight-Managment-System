package com.capg.fms.util; 
import java.util.*;
import com.capg.fms.dto.Airport;
public class AirportRepositary {
 
	static List<Airport> airportList=new ArrayList<Airport>();

	Airport  a1=new Airport("Indra Gandhi Airport","Delhi","701");
	Airport  a2=new Airport("Chattrapati Shivaji International Airport ","Mumbai","702");
	Airport  a3=new Airport("Chandigarh International Airport","Chandiagrh","703");
	 
	public AirportRepositary()
	{
		airportList.add(a1);
		airportList.add(a2);
		airportList.add(a3);
	}

	public static List<Airport> getAirportList() {
		return airportList;
	}
}
