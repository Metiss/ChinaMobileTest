package com.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.vo.Charge;

public class ChargeDaoImpl implements ChargeDao {
	@Override
	public void edit(Charge c){
		Dao.executeSql("update tcharge set CHARGE=? where CHARGE_CODE=?", c.getCharge(),c.getChargecode());

	}
	@Override
	public List<Charge> getAll(){
		// TODO Auto-generated method stub
		return Dao.query("select CHARGE_CODE chargecode,CHARGE_NAME chargename,CHARGE charge from tcharge", Charge.class);
	}

}
