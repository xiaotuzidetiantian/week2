package com.wuxufang.week2.domain;

public enum YearStatus {

//	年检状态是枚举类型,分为通过/未通过/待定
	A(0,"通过"),B(1,"未通过"),C(2,"待定");
	
	private Integer code;
	
	private String name;

	private YearStatus(Integer code, String name) {
		this.code = code;
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
