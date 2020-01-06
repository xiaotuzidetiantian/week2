package com.wuxufang.week2.service.impl;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.util.unit.DataUnit;

import com.wuxufang.util.NumberUtil;
import com.wuxufang.util.StringUtil;
import com.wuxufang.week2.domain.Company;

public class CompanyServiceImplTest {

	@Test
	public void test() throws Exception {
//		File file = new File("/senior-week2/src/test/resources/cms附件-机械设备公司年检信息.txt");
		InputStream in = new FileInputStream("/senior-week2/src/test/resources/cms附件-机械设备公司年检信息.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		List<Company> companyList = new ArrayList<Company>();
		String str = null;
		while((str = reader.readLine()) != null) {
//			Company company = new Company();
//			String[] split = str.split(" ");
//			company.setId(BigInteger.ONE);
//			a.id值要使用isNumber()工具方法判断是不是数字（3分）
//			if(NumberUtil.isNumber(str)) {
//				company.setGjz(split[1]);
//			}
//			keywords	、description、公司名称、主营产品、地址要使用
//			hasText()方法判断有没有值。（3分）
//			if(StringUtil.hasText(str)) {
//				company.setTab(split[2]);
//			}
//			if(StringUtil.hasText(str)) {
//				company.setName(split[3]);
//			}
//			if(StringUtil.hasText(str)) {
//				company.setProduct(split[4]);
//			}
//			if(StringUtil.hasText(str)) {
//				company.setAddress(split[5]);
//			}
//			 注册资本要使用hasText()方法判断有没有值，并使用
//			 isNumber()判断是不是数字（3分）
//			if(StringUtil.hasText(str)) {
//				if(NumberUtil.isNumber(str)) {
//					company.setRegister(Integer.parseInt(split[6]));
//				}
//			}
//			年检日期为null，在前端必须显示为空，不能显示null（3分）
//			if(StringUtil.hasText(str)) {
//				company.setDatea(split[7]);
//			} else {
//				company.setDatea("空");
//			}
//			成立时间要使用hasText()方法判断有没有值,判断是不是日期
//			类型（3分）
//			if(StringUtil.hasText(str)) {
//				company.setYearDatea(split[8]);
//			}
			System.out.println(str);
			
		}
	}

}
