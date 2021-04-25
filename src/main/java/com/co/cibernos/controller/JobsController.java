package com.co.cibernos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.co.cibernos.entities.Jobs;
import com.co.cibernos.services.JobService;
import com.co.cibernos.utils.RouterConstants;

@RestController
@RequestMapping(value = RouterConstants.ROUTE_CONTROLLER)
public class JobsController {
	
	@Autowired
	private JobService jobService;
	

	@GetMapping(value = RouterConstants.ROUTE_CONTROLLER_GET_BY_ID)
	public ResponseEntity<?> findById(@RequestParam(name = "code", required = true) int id){
		return jobService.finById(id);
	}

	@GetMapping(value = RouterConstants.ROUTE_CONTROLLER_GET_ALL)
	public ResponseEntity<?> getAllJobs(){
		return jobService.getAllJobs();
	}
	
	@PostMapping(value = RouterConstants.ROUTE_CONTROLLER_POST_SAVE)
	public ResponseEntity<?> saveJob(@RequestBody Jobs job){
		return jobService.saveJob(job);
	}
	
	@PutMapping(value = RouterConstants.ROUTE_CONTROLLER_PUT_UPDATE)
	public ResponseEntity<?> updateJob(@RequestBody Jobs job){
		return jobService.updateJob(job);
	}
	
	@DeleteMapping(value = "")
	public ResponseEntity<?> deleteJob(@RequestBody Jobs job){
		return jobService.deleteJob(job);
	}

}
