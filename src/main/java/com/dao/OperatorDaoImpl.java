package com.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.vo.Operator;

public class OperatorDaoImpl implements OperatorDao {

	@Override
	@Transactional
	public List<Operator> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Operator getSpecial(String operator_id,String operator_pwd) {
		// TODO Auto-generated method stub
		return Dao.queryOne("select * from toperator where OPERATOR_ID=? and OPERATOR_PWD=?",Operator.class,operator_id,operator_pwd);
	}

	@Override
	@Transactional
	public void save(Operator o) {
		// TODO Auto-generated method stub
		Dao.executeSql("insert into toperator values(?,?,?,?)",o.getOperator_id(),o.getOperator_name(),o.getOperator_pwd(),o.getIs_admin());
	}

	@Override
	public Operator getOne(String operator_id) {
		// TODO Auto-generated method stub
		return Dao.queryOne("select * from toperator where OPERATOR_ID=?", Operator.class, operator_id);
	}

}
