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
//		File file = new File("/senior-week2/src/test/resources/cms����-��е�豸��˾�����Ϣ.txt");
		InputStream in = new FileInputStream("/senior-week2/src/test/resources/cms����-��е�豸��˾�����Ϣ.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		List<Company> companyList = new ArrayList<Company>();
		String str = null;
		while((str = reader.readLine()) != null) {
//			Company company = new Company();
//			String[] split = str.split(" ");
//			company.setId(BigInteger.ONE);
//			a.idֵҪʹ��isNumber()���߷����ж��ǲ������֣�3�֣�
//			if(NumberUtil.isNumber(str)) {
//				company.setGjz(split[1]);
//			}
//			keywords	��description����˾���ơ���Ӫ��Ʒ����ַҪʹ��
//			hasText()�����ж���û��ֵ����3�֣�
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
//			 ע���ʱ�Ҫʹ��hasText()�����ж���û��ֵ����ʹ��
//			 isNumber()�ж��ǲ������֣�3�֣�
//			if(StringUtil.hasText(str)) {
//				if(NumberUtil.isNumber(str)) {
//					company.setRegister(Integer.parseInt(split[6]));
//				}
//			}
//			�������Ϊnull����ǰ�˱�����ʾΪ�գ�������ʾnull��3�֣�
//			if(StringUtil.hasText(str)) {
//				company.setDatea(split[7]);
//			} else {
//				company.setDatea("��");
//			}
//			����ʱ��Ҫʹ��hasText()�����ж���û��ֵ,�ж��ǲ�������
//			���ͣ�3�֣�
//			if(StringUtil.hasText(str)) {
//				company.setYearDatea(split[8]);
//			}
			System.out.println(str);
			
		}
	}

}
