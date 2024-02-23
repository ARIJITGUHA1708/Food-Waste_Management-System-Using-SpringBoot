package com.arijit.food.Controller;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.arijit.food.Model.AdminLogin;
import com.arijit.food.Model.AdminSignUp;
import com.arijit.food.Model.DonorNewRequest;
import com.arijit.food.Service.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping(value = "/loginAdmin", method = RequestMethod.GET)
	public String LoginAdmin() {
		return "AdminLogin.html";
	}

	@RequestMapping(value = "/adminSignUpFromLoginPage", method = RequestMethod.GET)
	public String AdminSignUp() {
		return "AdminSignUp.html";
	}
	@RequestMapping(value = "/adminSignUp",method = RequestMethod.POST)
	public String StoreData(AdminSignUp adminSignUp)
	{
		adminService.StoreAllData(adminSignUp);
		return "AdminLogin.html";
	}
	@RequestMapping(value = "/adminLogin",method = RequestMethod.POST)
	public ModelAndView CheckAdminLogin(AdminLogin adminLogin,Model model)
	{
		ModelAndView mView= new ModelAndView();
		List<DonorNewRequest> list=adminService.fetchAllDonorData();
		
		model.addAttribute("list",list);
		
		String email=list.get(0).getEmail();
		String nameoffood=list.get(0).getNameOfFood();
	    Date dateofcooking=	list.get(0).getDateOfCooking();
		LocalTime timeofcooking=list.get(0).getTimeOfCooking();
		mView.addObject("email",email);
		mView.addObject("nameoffood", nameoffood);
		mView.addObject("timeofcooking",timeofcooking);
		mView.addObject("dateofcooking",dateofcooking);
		int result=adminService.checkPassword(adminLogin);
		if(result==1)
		{
			mView.setViewName("AdminHomePage.html");
		}
		else {
			mView.setViewName("AdminLogin.html");
		}
		return mView;
	} 
	@RequestMapping(value = "/sendalldonortoagent",method = RequestMethod.POST)
	public ModelAndView sendAllDonorToAgent()
	{
		List<DonorNewRequest> list= adminService.fetchAllDonorData();
		ModelAndView mView=new ModelAndView();
		mView.setViewName("AdminHomePage.html");
		return mView;
	}
	
	
	
	
	
	
}
