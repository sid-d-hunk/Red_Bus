package com.sid.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sid.dto.BusListDTO;
import com.sid.dto.BusdetailsDTO;

public class BusImplementation {
	public List getBusList(Date journeyDate, Date returnDate){
		List<Object> busList = new ArrayList();
		BusdetailsDTO busdetailsDTO = new BusdetailsDTO();
		busList.add(busdetailsDTO);
		return busList;
	}
	

}
