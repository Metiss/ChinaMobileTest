package com.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.vo.Mobile;

public class MobileDaoImpl implements MobileDao {
	@Override
	@Transactional
	public void save(Mobile[] mobiles) {
		for(Mobile m:mobiles){
			Dao.executeSql("insert into tmobiles values(?,?,?,'Y')", m.getMobilenumber(),m.getMobiletype(),m.getCardnumber());
		}
	}
	@Override
	public Mobile getOne() {
		// TODO Auto-generated method stub
		return null;
	}

}
