package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDaoOne;
import dao.UserDaoTwo;

@Service
public class UserService {

	@Autowired
	private UserDaoOne userDaoOne;
	
	@Autowired
	private UserDaoTwo userDaoTwo;
	
	
	
	public int hi(String name, int age){
		
		int result = userDaoOne.save(name, age) + userDaoTwo.save(name, age);
		if(age > 10){
			throw new RuntimeException("test");
		}
		return result;
		
	}
}
