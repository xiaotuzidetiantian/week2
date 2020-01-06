package com.wuxufang.week2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wuxufang.week2.domain.Company;
import com.wuxufang.week2.domain.Vo;

public interface CompanyMapper {

	//将数据导入到数据库中
	public int insert(List<Company> list);

//	10.公司年检查询列表（5分）
	public List<Company> selects(Vo vo);

	@Select("select * from t_company where id=#{id}")
	public Company getById(@Param("id")Integer id);

	@Select("select * from t_company")
	public Company getCompany();

//	审核页面
	public void update(Company company);
}
