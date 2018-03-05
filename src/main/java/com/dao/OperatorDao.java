package com.dao;

import java.util.List;

import com.vo.Operator;

public interface OperatorDao {
	public List<Operator> getAll();
	public Operator getSpecial(String operator_id,String operator_pwd);
	public Operator getOne(String operator_id);
	public void save(Operator o);
}
