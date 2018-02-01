package com.dao;
import java.util.List;

import com.vo.*;

public interface ChargeRuleDao {
	public List<ChargeRule> getAll();
	public void edit(ChargeRule cr);
	public List<ChargeRule> getOne();
}
