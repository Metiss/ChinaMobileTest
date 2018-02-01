package com.dao;

import java.util.List;

import com.vo.User;

public interface UserDao {
	public List<User> get();
	public void save(User u);
}
