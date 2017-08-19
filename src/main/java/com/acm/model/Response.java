package com.acm.model;

public class Response {
	private boolean status;
	private String message;
	private Object result;

	public Response() {

	}

	public Response(boolean status, Object result) {
		this(status, null, result);
	}

	public Response(boolean status, String message) {
		this(status, message, null);
	}

	public Response(boolean status, String message, Object result) {
		this.status = status;
		this.message = message;
		this.result = result;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
