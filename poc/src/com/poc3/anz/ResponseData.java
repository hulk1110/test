package com.poc3.anz;

public class ResponseData {
	private int code;
	private String message;

	public ResponseData() {
		// TODO Auto-generated constructor stub
	}

	public ResponseData(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "ResponseData [code=" + this.getCode() + ", message=" + this.getMessage() + "]";
	}

}
