package com.arijit.food.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agent_sign_up")
public class AgentSignUp {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "aegent_name", length = 85, nullable = false, updatable = true)
	private String name;
	@Column(name = "agent_address", nullable = false, length = 90, updatable = true)
	private String address;
	@Column(name = "agent_email", nullable = false, length = 50, updatable = true)
	private String email;
	@Column(name="agent_password",length = 85,nullable = false,updatable = true)
	private String password;

	public AgentSignUp() {
		super();

	}

	public AgentSignUp(int id, String name, String address, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		return "AgentSignUp [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", password="
				+ password + "]";
	}

	

}
