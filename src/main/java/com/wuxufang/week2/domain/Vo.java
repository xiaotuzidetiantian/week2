package com.wuxufang.week2.domain;

import java.math.BigInteger;
import java.util.Date;

public class Vo {

	private BigInteger id;
	
	private String gjz;
	
	private String tab;
	
	private String name;
	
	private String product;
	
	private String address;
	
	private double register1;
	private double register2;
	
	private Date datea1;
	private Date datea2;
	
	private Date yearDatea1;
	private Date yearDatea2;
	
//	private String yearStatus;

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

	public double getRegister1() {
		return register1;
	}

	public void setRegister1(double register1) {
		this.register1 = register1;
	}

	public double getRegister2() {
		return register2;
	}

	public void setRegister2(double register2) {
		this.register2 = register2;
	}

	public Date getDatea1() {
		return datea1;
	}

	public void setDatea1(Date datea1) {
		this.datea1 = datea1;
	}

	public Date getDatea2() {
		return datea2;
	}

	public void setDatea2(Date datea2) {
		this.datea2 = datea2;
	}

	public Date getYearDatea1() {
		return yearDatea1;
	}

	public void setYearDatea1(Date yearDatea1) {
		this.yearDatea1 = yearDatea1;
	}

	public Date getYearDatea2() {
		return yearDatea2;
	}

	public void setYearDatea2(Date yearDatea2) {
		this.yearDatea2 = yearDatea2;
	}

//	public String getYearStatus() {
//		return yearStatus;
//	}
//
//	public void setYearStatus(String yearStatus) {
//		this.yearStatus = yearStatus;
//	}

}
