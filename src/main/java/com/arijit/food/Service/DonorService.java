package com.arijit.food.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arijit.food.Model.DonorNewRequest;
import com.arijit.food.Model.Login;
import com.arijit.food.Model.DonorSignUp;
import com.arijit.food.repo.addUser;
import com.arijit.food.repo.DonorNewRequestData;

@Service
public class DonorService {
	@Autowired
	addUser add;
	
	@Autowired DonorNewRequestData donorNewRequestDataReference;

	public void addU(DonorSignUp signUp) {
		add.save(signUp);
	}

	public int fetchData(Login login) {
		String email = login.getEmail();
		String password = login.getPassword();
		List<DonorSignUp> list = add.findByEmail(email);
		list.forEach(e -> System.out.println(e));
		String recordedEmail = list.get(0).getEmail();

		String recordedPassword = list.get(0).getPassword();
		if (recordedEmail.equals(email) && recordedPassword.equals(password)) {
			return 1;
		} else {

			return 0;

		}
	}

	public List<DonorSignUp> fetchAllData(String email) {
		List<DonorSignUp> alldataList = add.findByEmail(email);
		return alldataList;
	}

	public int getId(String email) {
		int a = add.findByIdDemo(email);
		//List<SignUp> signUp = add.findByIdDemo(email);
		//int id=signUp.get(0).getId();
		return a;
	 }
	public void saveDonorNewRequestData(DonorNewRequest donorNewRequest)
	{
		donorNewRequestDataReference.save(donorNewRequest);
	}
	public List<String> getFirstNameAndLastName(String email)
	{
		int a=getId(email);
		System.out.println(a);
		List<String> list= add.getFirstNameAndLastName(email);
		System.out.println(list);
		return list;
	}
}
