package com.springboot.demo.dao;

import java.util.List;

import com.springboot.demo.model.Patient;

public interface PatientDAO {
	List<Patient> get();
	
	Patient get(int pid);
	public void add(Patient patient);
	public void delete(int pid);
}
