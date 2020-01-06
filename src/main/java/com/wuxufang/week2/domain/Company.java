package com.wuxufang.week2.domain;

import java.math.BigInteger;
import java.util.Date;

public class Company {

	/*
	 * 5.编写公司年检业务实体（6分）
        a.id类型必须为BigInteger  （2分）
		b.年检状态是枚举类型,分为通过/未通过/待定 （2分）
		c.日期类型必须是java.util.Date（2分）
	 */
	private BigInteger id;
	
	private String gjz;
	
	private String tab;
	
	private String name;
	
	private String product;
	
	private String address;
	
	private double register;
	
	private Date datea;
	
	private Date yearDatea;
	
//	年检状态是枚举类型,分为通过/未通过/待定
	private YearStatus yearStatus;
	
	private String agains;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(BigInteger id, String gjz, String tab, String name, String product, String address, double register,
			Date datea, Date yearDatea, YearStatus yearStatus, String agains) {
		super();
		this.id = id;
		this.gjz = gjz;
		this.tab = tab;
		this.name = name;
		this.product = product;
		this.address = address;
		this.register = register;
		this.datea = datea;
		this.yearDatea = yearDatea;
		this.yearStatus = yearStatus;
		this.agains = agains;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getGjz() {
		return gjz;
	}

	public void setGjz(String gjz) {
		this.gjz = gjz;
	}

	public String getTab() {
		return tab;
	}

	public void setTab(String tab) {
		this.tab = tab;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getRegister() {
		return register;
	}

	public void setRegister(double register) {
		this.register = register;
	}

	public Date getDatea() {
		return datea;
	}

	public void setDatea(Date datea) {
		this.datea = datea;
	}

	public Date getYearDatea() {
		return yearDatea;
	}

	public void setYearDatea(Date yearDatea) {
		this.yearDatea = yearDatea;
	}

	public YearStatus getYearStatus() {
		return yearStatus;
	}

	public void setYearStatus(YearStatus yearStatus) {
		this.yearStatus = yearStatus;
	}

	public String getAgains() {
		return agains;
	}

	public void setAgains(String agains) {
		this.agains = agains;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", gjz=" + gjz + ", tab=" + tab + ", name=" + name + ", product=" + product
				+ ", address=" + address + ", register=" + register + ", datea=" + datea + ", yearDatea=" + yearDatea
				+ ", yearStatus=" + yearStatus + ", agains=" + agains + "]";
	}
	
}
