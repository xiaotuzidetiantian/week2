package com.wuxufang.week2.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuxufang.week2.dao.CompanyMapper;
import com.wuxufang.week2.domain.Company;
import com.wuxufang.week2.domain.Vo;
import com.wuxufang.week2.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Resource
	private CompanyMapper mapper;

	//�����ݵ��뵽���ݿ���
	@Override
	public int insert(List<Company> list) {
		return mapper.insert(list);
	}

//	10.��˾����ѯ�б�5�֣�
	@Override
	public PageInfo<Company> selects(Vo vo, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Company> list = mapper.selects(vo);
		PageInfo<Company> Info = new PageInfo<Company>(list);
		return Info;
	}

	@Override
	public Company getById(Integer id) {
		return mapper.getById(id);
	}

	@Override
	public Company getCompany() {
		return mapper.getCompany();
	}

	//���ҳ��
	@Override
	public void update(Company company) {
		mapper.update(company);
	}
	
	
	
}
