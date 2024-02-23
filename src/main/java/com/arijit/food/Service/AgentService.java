package com.arijit.food.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arijit.food.Model.AgentSignUp;
import com.arijit.food.Model.DonorNewRequest;
import com.arijit.food.repo.AgentSignUpData;
import com.arijit.food.repo.DonorNewRequestData;

@Service
public class AgentService {
	@Autowired
	private AgentSignUpData agentSignUpData;
	@Autowired
	private DonorNewRequestData donorNewRequestData1;

	public void addSignUpData(AgentSignUp agentSignUp) {
		agentSignUpData.save(agentSignUp);
	}
	public String fetchPasswordFromAgentSignUp(String email)
	{
	    String password=agentSignUpData.findByEmail1(email);
	    return password;
	}
	public List<DonorNewRequest> fetchAllRequestByDonor()
	{
		List<DonorNewRequest> list= donorNewRequestData1.fetchAllDataOfDonor();
		return list;
	}
	
}
