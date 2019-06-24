package com.suneee.utils;

import javax.servlet.http.HttpServletRequest;
/**
 * 
 * @author Administrator
 *
 */
public class Pager {

	public Long currentPage;
	public Long pageSize;
	public Long totalPage;
	public Long startRow;
	public Long totalRow;

	public Long getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public Long getStartRow() {
		return startRow;
	}

	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}

	public Long getTotalRow() {
		return totalRow;
	}

	public void setTotalRow(Long totalRow) {
		this.totalRow = totalRow;
	}

	public void setTalPage(Long totalRow) {
		if ((currentPage-1) * pageSize > totalRow) {
			currentPage = 1L;
		}
		this.totalRow = totalRow;
		Long totalPage = totalRow / pageSize;
		if(totalRow % pageSize != 0){
			totalPage++;
		}
		this.totalPage = totalPage;
		Long startRow = (currentPage - 1) * pageSize;
		this.startRow = startRow;
	}
	
	public void setReqPage(HttpServletRequest req){
		String currentPage=req.getParameter("currentPage");
		if(null==currentPage||"".equals(currentPage)){
			currentPage="1";
		}
		String pageSize=req.getParameter("pageSize");
		if(null==pageSize||"".equals(pageSize)){
			pageSize="10";
		}
		this.currentPage=Long.parseLong(currentPage);
		this.pageSize=Long.parseLong(pageSize);
	}

}
