package com.arijit.food.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arijit.food.Model.ContactUs;
import com.arijit.food.repo.ContactUsRepo;
@Service
public class ContactUsService {
	
	@Autowired
     private ContactUsRepo contactUsRepo;
	
public void addContactInformation(ContactUs contactUs)
{
	contactUsRepo.save(contactUs);
}
}
