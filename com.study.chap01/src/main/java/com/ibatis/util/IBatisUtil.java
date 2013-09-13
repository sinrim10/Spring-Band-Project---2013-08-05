package com.ibatis.util;

import com.ibatis.sqlmap.client.SqlMapClient;

import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.common.resources.Resources;

import java.io.Reader;
import java.io.IOException;
import java.util.List;
import java.sql.SQLException;


public class IBatisUtil {
	 private static SqlMapClient sqlMapper;
	 
	 static {
		    try {
		    	//클래스 패스 경로
		      Reader reader = Resources.getResourceAsReader("exam/ibatis/sqlmap/SqlMapConfig.xml");
		      sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
		      reader.close(); 
		    } catch (IOException e) {
		      // Fail fast.
		      throw new RuntimeException("Something bad happened while building the SqlMapClient instance." + e, e);
		    }
	 }
	 
	 
	 public static SqlMapClient getSqlMapClient(){
		 return sqlMapper;
	}

}
