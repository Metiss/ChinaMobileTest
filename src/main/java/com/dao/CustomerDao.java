package com.dao;
import java.util.List;

import com.vo.Customer;

public interface CustomerDao {
	public List<Customer> getAll();
	public Customer getSpecial(String ID_TYPE,String ID_NUMBER);
	public void save(Customer c);
}
