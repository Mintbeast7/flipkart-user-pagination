package com.flipkart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.flipkart.entity.UserEntity;
import com.flipkart.repository.UserRepository;
import com.flipkart.request.UserRequest;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public String createUser(UserRequest userRequest) {

		UserEntity entity = new UserEntity();

		entity.setFirstName(userRequest.getFirstName());
		entity.setLastName(userRequest.getLastName());
		entity.setAddress(userRequest.getAddress());

		userRepository.save(entity);

		return "User Details saved";
	}

	public Page<UserEntity> getUser() {
	    PageRequest p = PageRequest.of(0, 10);

	    Page<UserEntity> page = userRepository.findAll(p);

	    for (UserEntity entity : page) {
	        System.out.println(entity.getUserId());
	    }

	    return page;
	}

}
