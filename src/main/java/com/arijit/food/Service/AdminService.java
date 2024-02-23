package com.arijit.food.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arijit.food.Model.AdminLogin;
import com.arijit.food.Model.AdminSignUp;
import com.arijit.food.Model.DonorNewRequest;
import com.arijit.food.repo.AdminSignUpData;
import com.arijit.food.repo.DonorNewRequestData;

@Service
public class AdminService {
	@Autowired
	AdminSignUpData adminSignUpData;
	
	@Autowired DonorNewRequestData donorNewRequestData;

	public void StoreAllData(AdminSignUp adminSignUp) {
		adminSignUpData.save(adminSignUp);
	}

	public int checkPassword(AdminLogin adminLogin) {
		String email = adminLogin.getEmail();
		String password = adminLogin.getPassword();
		List<AdminSignUp> list = adminSignUpData.findByEmail(email);
		String checkemail = list.get(0).getEmail();
		String checkpassword = list.get(0).getPassword();
		if (email.equals(checkemail) && password.equals(checkpassword)) {
			return 1;
		} else {
			return 0;
		}

	}
	public List<DonorNewRequest> fetchAllDonorData()
	{
		List<DonorNewRequest> list= donorNewRequestData.fetchAllDataOfDonor();
		return list;
	}

}
