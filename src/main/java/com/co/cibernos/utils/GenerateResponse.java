package com.co.cibernos.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.co.cibernos.dto.GenericResponse;
import com.co.cibernos.dto.JobsDto;
import com.co.cibernos.entities.Jobs;

public class GenerateResponse {
	
	public static List<JobsDto> responseDto(List<Jobs> listJobs) {
		List<JobsDto> jobsDtos = new ArrayList<JobsDto>();
		for (int i = 0; i < listJobs.size(); i++) {
			JobsDto jobs = new JobsDto(listJobs.get(i).getId().toString(), 
					listJobs.get(i).getName(), listJobs.get(i).getDescription());
			jobsDtos.add(jobs);
		}
		return jobsDtos;
	}

}
