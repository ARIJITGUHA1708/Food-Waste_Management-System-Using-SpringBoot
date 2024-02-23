package com.arijit.food.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.arijit.food.Model.ContactUs;
import com.arijit.food.Service.ContactUsService;

@Controller
public class ContactUsController {
	@Autowired
	private ContactUsService contactUsService;

	@GetMapping(value = "/ContactUs")
	public String contactUs()
	{
		return "ContactUsPage.html";
	}
	@PostMapping(value = "/SendContactUsPageInformation")
	public ModelAndView sendContactUsInformation(ContactUs contactUs)
	{
		ModelAndView mv= new ModelAndView();
		contactUsService.addContactInformation(contactUs);
		mv.setViewName("Home.html");
		return mv;
		
	}
}
