package com.arijit.food.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.arijit.food.Model.AgentSignUp;


@Repository
public interface AgentSignUpData extends JpaRepository<AgentSignUp, Integer> {

	//@Query(nativeQuery = true,value = "select agent_password from agent_sign_up where email=:e")
	//List<AgentSignUp> findByEmail(@Param("e") String email);
	
	@Query(nativeQuery = true,value = "select agent_password from agent_sign_up where agent_email=:e")
	String findByEmail1(@Param("e") String email);
	
	
}
