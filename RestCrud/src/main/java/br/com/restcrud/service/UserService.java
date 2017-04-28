package br.com.restcrud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.restcrud.dao.UserDAO;
import br.com.restcrud.model.User;

@Service("userService")
public class UserService {

	@Autowired
	UserDAO userDao;

	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Transactional
	public User getUser(int id) {
		return userDao.getUser(id);
	}

	@Transactional
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Transactional
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}
}
