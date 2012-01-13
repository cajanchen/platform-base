package com.bzsafety.platform;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bzsafety.platform.dao.UserDao;
import com.bzsafety.platform.pojo.User;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		User user = new User();
		user.setUserName("cqq");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-*.xml");
		UserDao userDao = (UserDao)ctx.getBean("userDaoImpl");
		userDao.addUser(user);

	}

}
