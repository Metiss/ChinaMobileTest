package com.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.vo.Charge;
import com.vo.ChargeRule;

public class ChargeRuleDaoImpl implements ChargeRuleDao {

	@Override
	public List<ChargeRule> getAll() {
		return Dao.query("select * from tcharge_rule", ChargeRule.class);
	}

	@Override
	public void edit(ChargeRule cr) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ChargeRule> getOne() {
		// TODO Auto-generated method stub
		return null;
	}

}
