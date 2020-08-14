package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.Patient;
import com.springboot.demo.service.PatientService;

@RestController
@RequestMapping("/api")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patient")
	public List<Patient> get() {
		return patientService.get();
	}	
	
	@GetMapping("/patient/{pid}")
	public Patient get(@PathVariable int pid) {
		Patient patientObj = patientService.get(pid);
		if(patientObj == null)
			throw new RuntimeException("Employee with id "+pid+" not found!");
		return patientService.get(pid);
	}
	
	@PostMapping("/patient")
	public Patient add(@RequestBody Patient patient) {
		 patientService.add(patient);
		 return patient;
	}
	
	@PutMapping("/patient")
	public Patient update(@RequestBody Patient patientObj) {
		patientService.add(patientObj);
		return patientObj;
	}
	
	@DeleteMapping("/patient/{pid}")
	public String delete(@PathVariable int pid) {
		 patientService.delete(pid);
		 return "Patient record with "+pid+" has been deleted.";
	}
}
