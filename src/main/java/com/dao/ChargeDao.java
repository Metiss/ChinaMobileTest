package com.dao;

import java.util.List;

import com.vo.Charge;

public interface ChargeDao {
	public List<Charge> getAll();
	public void edit(Charge c);
}
