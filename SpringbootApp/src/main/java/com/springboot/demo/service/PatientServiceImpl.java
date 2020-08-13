package com.springboot.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.dao.PatientDAO;
import com.springboot.demo.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDAO patientDAO;
	
	@Transactional
	@Override
	public List<Patient> get() {
		return patientDAO.get();
	}

	@Transactional
	@Override
	public Patient get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void add(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
