package com.springboot.blog.model;

public class ReturnMessage {

	String status;

	String msg;

	UserData someone;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public UserData getSomeone() {
		return someone;
	}

	public void setSomeone(UserData someone) {
		this.someone = someone;
	}
}
