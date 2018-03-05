package com.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.util.PageInfo;
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
	@Transactional
	public List<Mobile> getAll() {
		// TODO Auto-generated method stub
		return Dao.query("select MOBILE_NUMBER mobilenumber from tmobiles where IS_AVAILABLE='Y'",Mobile.class);
	}
	@Override
	@Transactional
	public void UpdateMobile(String mobilenumber){
		Dao.executeSql("update tmobiles set IS_AVAILABLE='N' where MOBILE_NUMBER=?", mobilenumber);
	}
	@Override
	public void getAPageAll(PageInfo info) {
		Object[] obj=Dao.queryOne("select count(*) from tmobiles");
		
		int count=((Long)obj[0]).intValue();
		info.setRecordcount(count);
		
		List<Mobile> list=Dao.query("select MOBILE_NUMBER mobilenumber,MOBILE_TYPE mobiletype,CARD_NUMBER cardnumber,IS_AVAILABLE isavailable from tmobiles limit ?,?", Mobile.class,(info.getCurrentPage()-1)*info.getPagesize(),info.getPagesize()); 
		System.out.println(list);
		
		info.setList(list);
	}

}
