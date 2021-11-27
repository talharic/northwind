package com.project.northwind.business.abstracts;

import com.project.northwind.core.entities.User;
import com.project.northwind.core.utilities.results.DataResult;
import com.project.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
