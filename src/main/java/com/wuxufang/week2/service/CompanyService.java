package com.wuxufang.week2.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wuxufang.week2.domain.Company;
import com.wuxufang.week2.domain.Vo;

public interface CompanyService {

	//将数据导入到数据库中
	public int insert(List<Company> list);

//	10.公司年检查询列表（5分）
	public PageInfo<Company> selects(Vo vo, Integer page, Integer pageSize);

	public Company getById(Integer id);

	public Company getCompany();

	public void update(Company company);
}
