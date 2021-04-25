package com.co.cibernos.dto;

public class GenericResponse {
	
	private String code;
	private String message;
	private Object response;	
	
	public GenericResponse(String code, String message, Object response) {
		super();
		this.code = code;
		this.message = message;
		this.response = response;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
	
	
	

}
