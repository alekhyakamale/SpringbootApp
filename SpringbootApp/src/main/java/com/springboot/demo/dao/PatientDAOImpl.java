package com.springboot.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.demo.model.Patient;

@Repository
public class PatientDAOImpl implements PatientDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Patient> get() {
		Session session = entityManager.unwrap(Session.class);
		Query<Patient> query = session.createQuery("from Patient", Patient.class);
		List<Patient> list = query.getResultList();
		return list;
	}

	@Override
	public Patient get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
