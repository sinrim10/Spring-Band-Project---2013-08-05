package com.spring.test;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HomeServiceImpl implements HomeService{

	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	@Override
	public void list(Map modelMap, Command command) {
		// TODO Auto-generated method stub
		modelMap.put("qList", sqlMapClientTemplate.queryForList("sample.query1"));
		modelMap.put("group", command.getGroup());
		modelMap.put("type", command.getType());
		
		
	}

}
