package com.arijit.food.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arijit.food.Model.AdminSignUp;
import java.util.List;


@Repository
public interface AdminSignUpData extends JpaRepository<AdminSignUp, Integer> {
List<AdminSignUp> findByEmail(String email);
}
