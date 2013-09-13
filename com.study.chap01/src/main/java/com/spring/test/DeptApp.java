package com.spring.test;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.*;
public class DeptApp {

	public static void main(String[] args) throws Exception {
		
		Reader reader = Resources.getResourceAsReader("com/spring/test/SqlMapConfig.xml");
		SqlMapClient client = SqlMapClientBuilder.buildSqlMapClient(reader);
		
		//INSERT
		Dept dept1 = new Dept();
		dept1.setDeptno(60);
		dept1.setDname("HRD");
		dept1.setLoc("강남");
		
		client.insert("DEPT.add", dept1);		//mapper�� ����� id, parameter ��ü
		
		
		//SELECT - namespace�� ����ϵ��� �������� ��� => namespacename.id
		//SELECT�� ��� 1���� ���� queryForObject�� ���
		Dept dept2 = (Dept)client.queryForObject("DEPT.info", 20);
		System.out.println("dept2 : " + dept2 + "\n");
		
		
		//SELECT�� ��� �������� ��� queryForList�� ���
		List<Dept> deptList = client.queryForList("DEPT.infoAll", dept1);
		for(int i=0; i<deptList.size(); i++){
			System.out.println("deptList : " + deptList.get(i));
		}
	}
}
