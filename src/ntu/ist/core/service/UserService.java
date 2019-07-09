package ntu.ist.core.service;

import ntu.ist.core.po.User;

public interface UserService {
	public User findUser(String usercode,String password);
}
