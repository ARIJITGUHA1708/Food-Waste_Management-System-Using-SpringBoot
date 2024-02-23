package com.arijit.food.Controller;

import com.arijit.food.Model.DonorSignUp;
import com.arijit.food.Service.DonorService;
import com.arijit.food.Model.DonorNewRequest;
import com.arijit.food.Model.Login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DonorController {

	@Autowired
	private DonorService ser;

	@RequestMapping(value = "/")
	public String home() {
		return "Home.html";
	}

	@RequestMapping(value = "/aboutus")
	public String AboutUs() {
		return "AboutUs.html";
	}

	@RequestMapping(value = "/loginDonor")
	public String Login() {
		return "DonorLoginPage.html";
	}


	@RequestMapping(value = "/signup")
	public String SignUp() {
		return "DonorSignUpPage.html";
	}

	@RequestMapping(value = "/signuppage",method = RequestMethod.POST)
	public String SignUpPage(DonorSignUp signUp) {
		ser.addU(signUp);
		return "DonorLoginPage.html";
	}

	@RequestMapping(value = "/gotohome")
	public String gotohome() {
		System.out.println("inside gotohome method");
		return "Home.html";
	}

	@RequestMapping(value = "/donorNewRequest")
	public ModelAndView donorNewRequest(@RequestParam("email") String emailid) {
		System.out.println(emailid);
		ModelAndView mView = new ModelAndView();
		mView.addObject("email",emailid);
		mView.setViewName("DonorNewRequest.html");
		return mView;
	}

	@RequestMapping(value = "/loginenter",method = RequestMethod.POST)
	public ModelAndView login(Login login,Model model) {

		ModelAndView mView = new ModelAndView();
		String email = login.getEmail();
		List<String> list= ser.getFirstNameAndLastName(email);
		String firstName=list.get(0).toString();
		String lastName=list.get(0).toString();
		System.out.println(firstName);
		System.out.println(lastName);
		model.addAttribute("firstname",firstName);
		model.addAttribute("lastname",lastName);
		int result = ser.fetchData(login);
		if (result == 1) {
			mView.setViewName("DonorHomePage.html");
			mView.addObject("email", email);
		} else {
			mView.setViewName("DonorLoginPage.html");
		}
		return mView;
	}
	@RequestMapping(value = "/donorNewRequestData",method = RequestMethod.POST)
	public ModelAndView donorNewRequestData(DonorNewRequest donorNewRequest)
	{
		String email= donorNewRequest.getEmail();
		ser.saveDonorNewRequestData(donorNewRequest);
		ModelAndView mView = new ModelAndView();
		mView.setViewName("DonorHomePage.html");
		mView.addObject("email",email);
		return mView;
	}
	
	
	
	
	
	
	
}
