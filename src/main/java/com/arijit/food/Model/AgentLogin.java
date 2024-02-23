package com.arijit.food.Model;

public class AgentLogin {
	private String email;
	private String password;

	public AgentLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public AgentLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AgentLogin [email=" + email + ", password=" + password + "]";
	}

}
