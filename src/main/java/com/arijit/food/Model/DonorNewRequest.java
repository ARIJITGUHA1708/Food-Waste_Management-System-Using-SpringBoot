package com.arijit.food.Model;

import java.time.LocalTime;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name = "DonorNewRequest")
public class DonorNewRequest {
	@Id
	@Column(name = "email", length = 50)
	private String email;
	@Column(name = "name_of_food", length = 50)
	private String nameOfFood;
	@Column(name = "date_of_cooking", length = 50)
	private Date dateOfCooking;
	@Column(name = "time_of_cooking")
	private LocalTime timeOfCooking;
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;


	

	public DonorNewRequest() {
		super();
	}

	public DonorNewRequest(String email, String nameOfFood, Date dateOfCooking, LocalTime timeOfCooking, int id) {
		super();
		this.email = email;
		this.nameOfFood = nameOfFood;
		this.dateOfCooking = dateOfCooking;
		this.timeOfCooking = timeOfCooking;
		this.id = id;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNameOfFood() {
		return nameOfFood;
	}

	public void setNameOfFood(String nameOfFood) {
		this.nameOfFood = nameOfFood;
	}

	public Date getDateOfCooking() {
		return dateOfCooking;
	}

	public void setDateOfCooking(Date dateOfCooking) {
		this.dateOfCooking = dateOfCooking;
	}

	public LocalTime getTimeOfCooking() {
		return timeOfCooking;
	}

	public void setTimeOfCooking(LocalTime timeOfCooking) {
		this.timeOfCooking = timeOfCooking;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DonorNewRequest [email=" + email + ", nameOfFood=" + nameOfFood + ", dateOfCooking=" + dateOfCooking
				+ ", timeOfCooking=" + timeOfCooking + ", id=" + id + "]";
	}
	

	
	


}
