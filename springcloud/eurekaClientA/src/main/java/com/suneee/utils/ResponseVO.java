package com.suneee.utils;
/**
 * 
 * @author zmd
 *
 */
public class ResponseVO {

	private String status="200";
	
	private String message="success";
	
	private String code="0";
	
	private Object data;

	private Pager page;
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Pager getPage() {
		return page;
	}

	public void setPage(Pager page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "ResponseVO [status=" + status + ", message=" + message + ", code=" + code + ", data=" + data + ", page="
				+ page + "]";
	}
	
}
