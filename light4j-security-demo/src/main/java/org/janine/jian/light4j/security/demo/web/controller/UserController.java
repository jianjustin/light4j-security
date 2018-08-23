package org.janine.jian.light4j.security.demo.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.janine.jian.light4j.security.demo.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	
	@RequestMapping(value = "/user" , method = RequestMethod.GET)
	public List<User> query(){
		List<User> list = new ArrayList<User>();
		list.add(new User());
		return list;
	}
}
