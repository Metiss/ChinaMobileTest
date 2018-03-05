package com.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.vo.Charge;
import com.vo.ChargeRule;


public class ChargeRuleDaoImpl implements ChargeRuleDao {

	@Override
	@Transactional
	public List<ChargeRule> getAll() {
		return Dao.query("select * from tcharge_rule group by FUNC_NAME", ChargeRule.class);
	}

	@Override
	@Transactional
	public void edit(String func_name,String[] charge_code) {
		Dao.executeSql("delete from tcharge_rule where func_name=?", func_name);
		ChargeRule cr=Dao.queryOne("select max(func_id) func_id from tcharge_rule",ChargeRule.class);
		int i=1;
		for(String c:charge_code){
			Dao.executeSql("insert into tcharge_rule values(?,?,?)",cr.getFunc_id()+i,c,func_name);
			i++;
			}
	}

	@Override
	@Transactional
	public List<ChargeRule> getOne() {
		// TODO Auto-generated method stub
		return null;
	}

}
