package com.wuxufang.week2.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wuxufang.week2.domain.Company;
import com.wuxufang.week2.domain.Vo;
import com.wuxufang.week2.service.CompanyService;

@Controller
public class CompanyController {

	@Resource
	private CompanyService service;
	
//	10.��˾����ѯ�б�5�֣�
	@RequestMapping("selects")
	public String selects(Vo vo,Model m,@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="3")Integer pageSize) {
		PageInfo<Company> Info = service.selects(vo,page,pageSize);
		m.addAttribute("Info", Info);
		m.addAttribute("vo", vo);
		return "company";
	}
	
//	11.��˾�����ˣ�14�֣� 
	@RequestMapping("toUpdate.do")
	public String toUpdate(Integer id,Model m) {
		Company cid = service.getById(id);
		Company company = service.getCompany();
		m.addAttribute("cid", cid);
		m.addAttribute("company", company);
		return "update";
	}
	
	//���ҳ��
	@RequestMapping("/update")
	public String update(Company company) {
		service.update(company);
		return "company";
	}
}
