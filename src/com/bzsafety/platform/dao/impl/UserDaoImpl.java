package com.bzsafety.platform.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bzsafety.platform.dao.UserDao;
import com.bzsafety.platform.pojo.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public void addUser(User user) {
		this.getHibernateTemplate().save(user);

	}

}
