package com.arijit.food.Controller;

import com.arijit.food.Model.AgentSignUp;
import com.arijit.food.Model.DonorNewRequest;
import com.arijit.food.Service.AgentService;
import com.arijit.food.Model.AgentLogin;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AgentController {
	@Autowired
	private AgentService agentService;

	@RequestMapping(value = "/loginAgent")
	public String AgentLogin() {
		return "AgentLoginPage.html";
	}

	@RequestMapping(value = "/SignUpAgentFromLogin")
	public String SignUpAgentFromLogin() {
		return "AgentSignUp.html";
	}

	@RequestMapping(value = "/AgentSignUp",method = RequestMethod.POST)
	public String AgentSignUp(AgentSignUp agentSignUp) {
		agentService.addSignUpData(agentSignUp);
		return "AgentLoginPage.html";
	}

	@RequestMapping(value = "/loginAgentData", method = RequestMethod.POST)
	public ModelAndView LoginAgentData(AgentLogin agentLogin) {

		List<DonorNewRequest> list = agentService.fetchAllRequestByDonor();
		String emailofdonor = list.get(0).getEmail();
		String nameoffood = list.get(0).getNameOfFood();
		Date dateofcooking = list.get(0).getDateOfCooking();
		LocalTime timeofcooking = list.get(0).getTimeOfCooking();
		System.out.println(emailofdonor);
		System.out.println(nameoffood);
		
		ModelAndView mView = new ModelAndView();
		mView.addObject("emailofdonor", emailofdonor);
		mView.addObject("nameoffood", nameoffood);
		mView.addObject("dateofcooking", dateofcooking);
		mView.addObject("timeofcooking", timeofcooking);
		String email = agentLogin.getEmail();
		String password = agentLogin.getPassword();
		String fetchpassword = agentService.fetchPasswordFromAgentSignUp(email);
		if (password.equals(fetchpassword)) {
			
			mView.setViewName("AgentHomePage.html");
			
		} else {
			mView.setViewName("AgentLoginPage.html");
			//mView.addObject(0);
			

		}
		return mView;
	}
}
