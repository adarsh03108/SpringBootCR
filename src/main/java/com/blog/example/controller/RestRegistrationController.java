package com.blog.example.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blog.example.dto.RegistrationDto;
import com.blog.example.dto.RestRegistrationDto;
import com.blog.example.entity.Registration;
import com.blog.example.repository.RegistrationRepository;

@RestController
@RequestMapping("/api/registrations")
public class RestRegistrationController{
	
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@GetMapping("/music")
	public String music() {
		return "music is playing";
	}
	@GetMapping("/health")
	public String health() {
		return "Health is good";
	}
	
//	@GetMapping
//	public List<Registration> getAllReg(){
//		List<Registration> reg = registrationRepository.findAll();
//		return reg;
//	}
//	@DeleteMapping("/{id}")
//	public void deleteById(@PathVariable long id) {
//		registrationRepository.deleteById(id);
//	}
//	
//	@PostMapping
//	public void saveRegistration(@RequestBody Registration reg) {
//		registrationRepository.save(reg);
//	}
//	
//	@PutMapping
//	public void updateRegistration(@RequestParam long id,@RequestBody RegistrationDto dto) {
//		Registration reg = registrationRepository.findById(id).get();
//		reg.setFirstName(dto.getFirstName());
//		reg.setLastName(dto.getLastName());
//		reg.setEmail(dto.getEmail());
//		reg.setMobile(dto.getMobile());
//		registrationRepository.save(reg);	
//	}
	
//	@GetMapping
//	public List<Registration> getAllReg(){
//		List<Registration> reg = registrationRepository.findAll();
//		return reg;
//	}
	
	
//	@DeleteMapping("/{id}")
//	public void deleteById(@PathVariable long id) {
//		registrationRepository.deleteById(id);
//	}
//	
//	@PostMapping
//	public void saveRegistration(@RequestBody Registration reg) {
//		registrationRepository.save(reg);
//	}
	
//	@PutMapping
//	public void updateRegistration(@RequestParam long id ,@RequestBody RegistrationDto dto) {
//	Registration reg = registrationRepository.findById(id).get();	
//		reg.setFirstName(dto.getFirstName());
//		reg.setLastName(dto.getLastName());
//		reg.setEmail(dto.getEmail());
//		reg.setMobile(dto.getMobile());
//		registrationRepository.save(reg);
//	}
	
	@GetMapping
	public ResponseEntity<RestRegistrationDto> getAllReg(){
		List<Registration> reg = registrationRepository.findAll();
		RestRegistrationDto dto= new RestRegistrationDto();
		dto.setRegistration(reg);
		dto.setMessage("Read Completed!");
		return new ResponseEntity<>(dto,HttpStatus.OK);
	}
	@GetMapping("/show/{id}")
	public Optional<Registration> getById(@PathVariable long id){
		Optional<Registration> regs = registrationRepository.findById(id);
		return regs;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable long id){
		registrationRepository.deleteById(id);
		return new ResponseEntity<>("Delete",HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Registration> saveRegistration(@Valid @RequestBody Registration reg){
		Registration saved = registrationRepository.save(reg);
		return new ResponseEntity<>(saved,HttpStatus.CREATED);
		
	}
	@PutMapping
	public ResponseEntity<Registration> updateRegistration( @RequestParam long id,@RequestBody RegistrationDto dto){
	Registration reg = registrationRepository.findById(id).get();
	reg.setFirstName(dto.getFirstName());
	reg.setLastName(dto.getLastName());
	reg.setEmail(dto.getEmail());
	reg.setMobile(dto.getMobile());
	Registration savedReg = registrationRepository.save(reg);
	return new ResponseEntity<>(savedReg,HttpStatus.CREATED);

	}
	
	
	}
	


