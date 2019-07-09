package ntu.ist.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ntu.ist.core.dao.UserDao;
import ntu.ist.core.po.User;
import nut.ist.core.service.UserService;
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    //注入UserDao
	@Autowired
	private UserDao userDao;
	@Override
	public User findUser(String usercode, String password) {
        User user=this.userDao.findUser(usercode,password);		
		return user;
	}

}
