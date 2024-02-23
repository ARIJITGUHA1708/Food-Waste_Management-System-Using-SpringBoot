package com.arijit.food.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.arijit.food.Model.DonorSignUp;
import java.util.List;

@Repository
public interface addUser extends JpaRepository<DonorSignUp, Integer> {

	List<DonorSignUp> findByEmail(String email);

	@Query(nativeQuery = true, value = "select id from sign_up_table where email=:e")
	int findByIdDemo(@Param("e") String email);
	@Query(nativeQuery = true,value = "select id from sign_up_table where email=:e")
	int getUsers(@Param("e") String email);
	
	@Query(nativeQuery = true,value = "select first_name from sign_up_table where email=:e")
	List<String> getFirstNameAndLastName(@Param("e") String email);
	
	
}
