package com.arijit.food.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.arijit.food.Model.ContactUs;
@Repository
public interface ContactUsRepo extends JpaRepository<ContactUs, String> {

	
	
}
