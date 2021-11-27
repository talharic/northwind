package com.project.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.northwind.business.abstracts.UserService;
import com.project.northwind.core.dataAccess.UserDao;
import com.project.northwind.core.entities.User;
import com.project.northwind.core.utilities.results.DataResult;
import com.project.northwind.core.utilities.results.Result;
import com.project.northwind.core.utilities.results.SuccessDataResult;
import com.project.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email)
				,"Kullanıcı bulundu");
	}

}
