package com.arijit.food.Model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "Admin_sign_up")
public class AdminSignUp {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "admin_name", nullable = false, updatable = true)
	private String name;
	@Column(name = "admin_email", nullable = false, updatable = true)
	private String email;
	@Column(name = "admin_address", nullable = false, updatable = true)
	private String address;
	@Column(name = "admin_password", nullable = false, updatable = true)
	private String password;

	public AdminSignUp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminSignUp(int id, String name, String email, String address, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminSignUp [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", password="
				+ password + "]";
	}

}
