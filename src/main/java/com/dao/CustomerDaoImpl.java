package com.dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;
import com.oracle.jdbc.util.Transactional;
import com.vo.Customer;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	@Transactional
	public Customer getSpecial(String ID_TYPE,String ID_NUMBER) {
		// TODO Auto-generated method stub
		return Dao.queryOne("select * from tcustomer where ID_TYPE=? and ID_NUMBER=?",Customer.class,ID_TYPE,ID_NUMBER);
	}

	@Override
	@Transactional
	public void save(Customer c) {
		// TODO Auto-generated method stub
		Dao.executeSql("insert into tcustomer values(null,?,?,?,?,?,?)", c.getId_type(),c.getId_number(),c.getCustomer_name(),c.getCustomer_birthday(),c.getCustomer_sex(),c.getCustomer_address());
	}

	@Override
	@Transactional
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return Dao.query("select * from tcustomer", Customer.class);
	}

}
