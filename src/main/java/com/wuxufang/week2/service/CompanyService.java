package com.wuxufang.week2.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wuxufang.week2.domain.Company;
import com.wuxufang.week2.domain.Vo;

public interface CompanyService {

	//�����ݵ��뵽���ݿ���
	public int insert(List<Company> list);

//	10.��˾����ѯ�б�5�֣�
	public PageInfo<Company> selects(Vo vo, Integer page, Integer pageSize);

	public Company getById(Integer id);

	public Company getCompany();

	public void update(Company company);
}
