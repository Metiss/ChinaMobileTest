package com.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.vo.Operater;

public class OperaterDaoImpl implements OperaterDao {

	@Override
	public List<Operater> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Operater> getSpecial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Operater o) {
		// TODO Auto-generated method stub
		Dao.executeSql("insert into toperator values(?,?,?,?)",o.getOperator_id(),o.getOperator_name(),o.getOperator_pwd(),o.getIs_admin());
	}

}
