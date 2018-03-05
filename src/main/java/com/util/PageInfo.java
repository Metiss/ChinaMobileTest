package com.util;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class PageInfo {
	int currentPage=1;//��ǰҳ
	int pageCount;//��ҳ��
	int pageSize=6;//ÿҳ�ļ�¼��
	int recordCount;//�ܼ�¼��
	
	List list=new ArrayList();//��ǰҳ������

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageCount() {
		return this.recordCount%this.pageSize==0?this.recordCount/this.pageSize:this.recordCount/this.pageSize+1;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPagesize() {
		return pageSize;
	}

	public void setPagesize(int pagesize) {
		this.pageSize = pagesize;
	}

	public int getRecordcount() {
		return recordCount;
	}

	public void setRecordcount(int recordcount) {
		this.recordCount = recordcount;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	public PageInfo(HttpServletRequest request){
		String page=request.getParameter("currentPage");
		if(page!=null){
			this.currentPage=Integer.valueOf(page);
		}
		request.setAttribute("pageinfo", this);
	}
}
