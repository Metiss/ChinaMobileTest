package com.dao;
import java.util.List;

import com.vo.*;

public interface ChargeRuleDao {
	public List<ChargeRule> getAll();
	public void edit(String func_name,String[] charge_code);
	public List<ChargeRule> getOne();
}
