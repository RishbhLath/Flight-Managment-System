package testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;

import com.capg.fms.dto.Airport;
import com.capg.fms.exception.MyException;
import com.capg.fms.service.AirportService;
import com.capg.fms.util.AirportRepositary;

class TestService {

	AirportService airService=new AirportService();

    @Test
	public void airportServiceTest()
	{
    	new AirportRepositary();
    	Airport expected=new Airport("Indra Gandhi Airport","Delhi","701");
    	Airport testresult=null;
    	try{
    		assertEquals(expected.getAirportCode(), airService.viewAirportService("701").getAirportCode());
    		 
    	}
       catch(Exception e) {
    		
    	                   }
       
	}
	
	
	
 @Test
    public void airportMissingServiceTest()
    {
    	Exception exception=assertThrows(Exception.class,()->{
    		new AirportRepositary();
    		 airService.viewAirportService("70").getAirportCode(); 
    	    }
    	);
    	
    	assertEquals("OOps!! there is no airport with the airport code you have mentioned.", exception.getMessage());
    	
    }


  
        @Test
		public void airportServiceDetailsTest()
		{
	    	new AirportRepositary();
	  
	    	List<Airport> listAirport=AirportRepositary.getAirportList();
	    	Airport testresult=null;
	    	try{
	    		List<Airport> listAirportDeatils=airService.viewAirportService();
	    		assertEquals(listAirport, airService.viewAirportService());
	    		 
	    	}
	    	catch(Exception e) {
	    		
	    	}
	       
		}
	
  /*
    @Test
    public void airportMissingServiceDetailsTest()
    {
    	Exception exception=assertThrows(Exception.class,()->{
    		new AirportRepositary();
    		 airService.viewAirportService();
    	    }
    	);
    	assertEquals("OOps!! the database is empty.", exception.getMessage());
    	
    }
   */
  
}
