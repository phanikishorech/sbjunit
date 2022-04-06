package com.work.task.sbjpa.model;

import java.util.List;
import java.math.BigInteger;

import javax.persistence.*;

public class ErrorResponse {

	private String message;
	private boolean status;
	private Object data;

	public ErrorResponse(String message, boolean status, Object data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ErrorResponse() {
		super();
	}

}