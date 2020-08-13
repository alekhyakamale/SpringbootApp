package com.springboot.demo.service;

import java.util.List;

import com.springboot.demo.model.Patient;

public interface PatientService {
	List<Patient> get();
	
	Patient get(int id);
	public void add(Patient patient);
	public void delete(int id);
}
