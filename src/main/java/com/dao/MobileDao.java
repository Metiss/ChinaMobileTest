package com.dao;
import java.util.List;

import com.util.PageInfo;
import com.vo.*;

public interface MobileDao {
	public void save(Mobile[] mobile);
	public List<Mobile> getAll();
	public void UpdateMobile(String mobilenumber);
	public void getAPageAll(PageInfo info);
}
