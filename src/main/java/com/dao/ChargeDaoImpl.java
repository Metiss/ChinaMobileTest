package com.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.vo.Charge;

public class ChargeDaoImpl implements ChargeDao {
	@Override
	@Transactional
	public void edit(Charge c){
		Dao.executeSql("update tcharge set CHARGE=? where CHARGE_CODE=?", c.getCharge(),c.getChargecode());

	}
	@Override
	@Transactional
	public List<Charge> getAll(){
		// TODO Auto-generated method stub
		return Dao.query("select CHARGE_CODE chargecode,CHARGE_NAME chargename,CHARGE charge from tcharge", Charge.class);
	}

}
