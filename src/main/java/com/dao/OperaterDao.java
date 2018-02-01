package com.dao;

import java.util.List;

import com.vo.Operater;

public interface OperaterDao {
	public List<Operater> getAll();
	public List<Operater> getSpecial();
	public void save(Operater o);
}
