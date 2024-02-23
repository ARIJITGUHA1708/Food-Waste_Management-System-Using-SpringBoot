package com.arijit.food.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arijit.food.Model.DonorNewRequest;

public interface DonorNewRequestData extends JpaRepository<DonorNewRequest, String> {

	@Query(nativeQuery = true,value="select *from donor_new_request")
	List<DonorNewRequest> fetchAllDataOfDonor();
}
