package com.techgeeknext.airline.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techgeeknext.airline.model.Flight;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {
	
	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public List <Flight> getFlights(Model model) {
		// Requesting flights
		List <Flight> flightList = new ArrayList<Flight>();
		flightList.add(new Flight("FS2211", "NYC", "GRM" ));
		flightList.add(new Flight("FS2211", "LHR", "ARN" ));
		
		return flightList;
	}

}
