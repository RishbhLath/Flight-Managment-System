package com.capg.fms.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.fms.dto.Airport;
import com.capg.fms.exception.MyException;
import com.capg.fms.service.AirportService;
import com.capg.fms.util.AirportRepositary;

public class FlightManagementSystem {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		
		new AirportRepositary();
		System.out.println("*************FLIGHT MANAGEMENTSYSTEM************\n");
		while(true)
		{
		System.out.println("MAIN MENU>>>>>>>\n");
		System.out.println("PRESS 1 TO SEARCH THE AIRPORT NAME, IF YOU ALREADY KNOW THE AIRPORT CODE.");
		System.out.println("PRESS 2 TO GET THE AIRPORT LIST");
		System.out.println("PRESS 3 TO EXIT");
		
		Scanner input=new Scanner(System.in);
		
		int option=input.nextInt();
		System.out.println("\nYOU HAVE PRESS "+option);
		 switch(option)
		 {
		 case 1:

		System.out.println("PLEASE ENTER THE AIRPORT CODE");
		String airportCode=input.next();
		
        AirportService airportService=new AirportService();
        
			Airport result = null;
			try {
				
				result = airportService.viewAirportService(airportCode);
				 System.out.println("\n");
				System.out.println("Aiport Code: "+result.getAirportCode()+"\nLocation: "+result.getAirportLocation()+"\nAirport Name: "+result.getAirportName());
				
			} catch (MyException e) {
				 System.out.println("\n");
				System.out.println(e.getMessage());
			}
		
	
		break;
        
		 case 2:
		AirportService airportServices=new AirportService();
		try {
		List<Airport> listAirportDeatils=airportServices.viewAirportService();
		for(Airport airportobj:listAirportDeatils)
		{
			 System.out.println("\n");
			System.out.println("Aiport Code: "+airportobj.getAirportCode()+" Location: "+airportobj.getAirportLocation()+" Airport Name: "+airportobj.getAirportName()+"\n");
		}
		    }catch (MyException e)
		{
		    	 System.out.println("\n");
		    	System.out.println(e.getMessage());
		}
		break;
		 default: System.out.println(" ,So you are exit!!!");
		 return;
		 }
		 System.out.println("\n");
		 System.out.println("************************************************");
		
		}
	}


}
