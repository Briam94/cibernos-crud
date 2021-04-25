package com.co.cibernos.servicesimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.co.cibernos.dao.JobsDao;
import com.co.cibernos.dto.GenericResponse;
import com.co.cibernos.dto.JobsDto;
import com.co.cibernos.entities.Jobs;
import com.co.cibernos.services.JobService;
import com.co.cibernos.utils.GenerateResponse;

@Service
public class JobServiceImpl implements JobService{
	
	@Autowired
	private JobsDao jobsDao;
	
	public ResponseEntity<?> finById(Integer id){
		GenericResponse genericResponse;
		try {
			Jobs job = jobsDao.find(id);
			if(job == null) return new ResponseEntity<>(new GenericResponse("0", "Trabajo no encontrado.", null), HttpStatus.OK);
			genericResponse = new GenericResponse("1", "Exitoso", job);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(new GenericResponse("0", "Trabajo no encontrado.", null), HttpStatus.OK);
		}
		return new ResponseEntity<>(genericResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<?> getAllJobs() {
		GenericResponse genericResponse;
		try {
			List<Jobs> listJobs = new ArrayList<Jobs>();
			listJobs = jobsDao.findAll();
			List<JobsDto> list = GenerateResponse.responseDto(listJobs);
			genericResponse = new GenericResponse("1", "Exitoso", list);
		} catch (Exception e) {
			return new ResponseEntity<>(new GenericResponse("0", "Error", null), HttpStatus.OK);
		}
		
		return new ResponseEntity<>(genericResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<?> saveJob(Jobs jobs) {
		GenericResponse genericResponse;
		try {
			jobsDao.create(jobs);
			genericResponse = new GenericResponse("1", "Registro almacenado con exito", null);
		} catch (Exception e) {
			genericResponse = new GenericResponse("0", "Ups ha ocurrido un error al guardar, por favor intente mas tarde", null);
		}
		return new ResponseEntity<>(genericResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<?> updateJob(Jobs job){
		GenericResponse genericResponse;
		try {
			jobsDao.update(job);
			genericResponse = new GenericResponse("1", "Registro actualizado con exito", null);
		} catch (Exception e) {
			genericResponse = new GenericResponse("0", "Ups ha ocurrido un error al actualizar, por favor intente mas tarde", null);
		}
		return new ResponseEntity<>(genericResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<?> deleteJob(Jobs job){
		GenericResponse genericResponse;
		try {
			jobsDao.remove(job);
			genericResponse = new GenericResponse("1", "Registro eliminado con exito", null);
		} catch (Exception e) {
			genericResponse = new GenericResponse("0", "Ups ha ocurrido un error al eliminar, por favor intente mas tarde", null);
		}
		return new ResponseEntity<>(genericResponse, HttpStatus.OK);
	}

}
