package com.wuxufang.week2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wuxufang.week2.domain.Company;
import com.wuxufang.week2.domain.Vo;

public interface CompanyMapper {

	//�����ݵ��뵽���ݿ���
	public int insert(List<Company> list);

//	10.��˾����ѯ�б�5�֣�
	public List<Company> selects(Vo vo);

	@Select("select * from t_company where id=#{id}")
	public Company getById(@Param("id")Integer id);

	@Select("select * from t_company")
	public Company getCompany();

//	���ҳ��
	public void update(Company company);
}
