package com.wuxufang.week2.domain;

public enum YearStatus {

//	���״̬��ö������,��Ϊͨ��/δͨ��/����
	A(0,"ͨ��"),B(1,"δͨ��"),C(2,"����");
	
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
