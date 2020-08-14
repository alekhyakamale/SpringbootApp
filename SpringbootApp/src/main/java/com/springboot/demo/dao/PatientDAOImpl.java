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
	public Patient get(int pid) {
		Session session = entityManager.unwrap(Session.class);
		Patient patientObj = session.get(Patient.class, pid);
		return patientObj;
	}

	@Override
	public void add(Patient patient) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(patient);
	}

	@Override
	public void delete(int pid) {
		Session session = entityManager.unwrap(Session.class);
		Patient patientObj = session.get(Patient.class, pid);
		session.delete(patientObj);
	}

}
