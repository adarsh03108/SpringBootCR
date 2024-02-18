package com.blog.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.example.entity.Registration;
import com.blog.example.repository.RegistrationRepository;

@Service
public class RegistrationService  {
	@Autowired
	private RegistrationRepository registrationRepository;

	public void save(Registration registration) {
		registrationRepository.save(registration);
		
		
	}

	public List<Registration> getAllRegistrations() {
		List<Registration> regs = registrationRepository.findAll();
		return regs;
		
	}

	public void deleteById(long id) {
	registrationRepository.deleteById(id);
		
	}

	public Registration getRegistrationById(long id) {
		Registration reg = registrationRepository.findById(id).get();
		return reg;
	}

}
