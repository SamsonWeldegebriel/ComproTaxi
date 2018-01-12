package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.Taxi;
import edu.mum.repository.TaxiRepository;
import edu.mum.service.TaxiService;


 
@Service
 public class TaxiServiceImpl implements TaxiService  {
	
	@Autowired 
	TaxiRepository taxiRepository;
	
	public List<Taxi> getAll() {
		return taxiRepository.getAll();
	}
	
	public Taxi findByName(String name) {
		return taxiRepository.findByName(name);
	}
	
	
		   
}
 
