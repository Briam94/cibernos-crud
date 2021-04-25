package com.co.cibernos.services;

import org.springframework.http.ResponseEntity;

import com.co.cibernos.entities.Jobs;

public interface JobService {
	
	public ResponseEntity<?> getAllJobs();
	
	public ResponseEntity<?> saveJob(Jobs jobs);
	
	public ResponseEntity<?> updateJob(Jobs job);
	
	public ResponseEntity<?> deleteJob(Jobs job);
	
	public ResponseEntity<?> finById(Integer id);

}
