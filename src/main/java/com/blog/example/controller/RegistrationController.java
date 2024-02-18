package com.blog.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.example.dto.RegistrationDto;
import com.blog.example.entity.Registration;
import com.blog.example.service.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
private RegistrationService registrationService;
	
	//http://localhost:8080/view-registration-page
	
	@RequestMapping("/view-registration-page")
	public String viewRegistrationPage(){
		return "index";
	}
	
//	@RequestMapping("/saveReg")
//	public String saveRegistration(Registration registration) {
//		System.out.println(registration.getFirstName());
//		System.out.println(registration.getLastName());
//		System.out.println(registration.getEmail());
//		System.out.println(registration.getMobile());
//		registrationService.save(registration);
//		return "registration";
//	}
	
//	@RequestMapping("/saveReg")
//	public String saveRegistration(
//			@RequestParam("firstName") String fName,
//			@RequestParam("lastName")String lName,
//			@RequestParam("email")String email,
//			@RequestParam("mobile") long mobile,
//			ModelMap model
//			) {
//		Registration registration= new Registration();
//		registration.setFirstName(fName);
//		registration.setLastName(lName);
//		registration.setEmail(email);
//		registration.setMobile(mobile);
//		registrationService.save(registration);
//		model.addAttribute("msg", "record is saved!");
//		return "registration";
//	}
//	
	
	@RequestMapping("/saveReg")
	public String saveRegistration(
			Registration registration,
			RegistrationDto registrationDto,
			ModelMap model
			) {
		registration.setFirstName(registrationDto.getFirstName());
		registration.setLastName(registrationDto.getLastName());
	
		registration.setEmail(registration.getEmail());
		registration.setMobile(registrationDto.getMobile());
		registrationService.save(registration);
		return "index";
	}
	@RequestMapping("/getAllReg")
	public String getAllRegistration(ModelMap model) {
		List<Registration> reg = registrationService.getAllRegistrations();
		System.out.println(reg);
		model.addAttribute("registrations", reg);
		return "list_registration";
	}
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("id") long id,ModelMap model) {
		registrationService.deleteById(id);
		
		List<Registration> reg= registrationService.getAllRegistrations();
		model.addAttribute("registrations",reg);
		return "list_registration";
	}
	@RequestMapping("/getRegistrationById")
	public String getRegistrationById(@RequestParam("id") long id,ModelMap model) {
		Registration registration= registrationService.getRegistrationById(id);
		System.out.println(100);
		model.addAttribute("reg", registration);
		return "update_registration";
	}
	
	@RequestMapping("/updateReg")
	public String updateRegistration(RegistrationDto dto,ModelMap model) {
		Registration registration= new Registration();
		registration.setId(dto.getId());
		registration.setFirstName(dto.getFirstName());
		registration.setLastName(dto.getLastName());
		registration.setEmail(dto.getEmail());
		registration.setMobile(dto.getMobile());
		
		registrationService.save(registration);
		
		List<Registration> reg= registrationService.getAllRegistrations();
		model.addAttribute("registrations", reg);
		return "list_registration";
	}

}
