package com.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.vo.User;

public class UserDaoImpl implements UserDao {
/*
	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	@Transactional
	public void save(User u) {
		// TODO Auto-generated method stub
		Dao.executeSql("insert into tuser values(null,?,?,?,?,'Y')", u.getMobile_number(),u.getRoaming_status(),u.getCom_level(),u.getCustomer_id());
		Dao.executeSql("update tmobiles set IS_AVAILABLE='N' where MOBILE_NUMBER=?", u.getMobile_number());
	}

}
