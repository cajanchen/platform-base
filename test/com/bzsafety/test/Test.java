package com.bzsafety.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bzsafety.platform.dao.UserDao;
import com.bzsafety.platform.pojo.User;

import junit.framework.TestCase;

public class Test extends TestCase {
	
	public void testAddUser(){
		
		User user = new User();
		user.setUserName("cqqgg");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-*.xml");
		UserDao userDao = (UserDao)ctx.getBean("userDaoImpl");
		userDao.addUser(user);
	}

}
