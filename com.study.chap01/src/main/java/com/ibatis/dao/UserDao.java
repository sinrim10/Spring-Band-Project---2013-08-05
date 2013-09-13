package com.ibatis.dao;
import com.ibatis.dto.*;
import java.sql.SQLException;
import java.util.List;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.util.*;
import com.ibatis.sqlmap.*;


public class UserDao {
	
	public void insert(UserDto dto) throws ClassNotFoundException, SQLException{
		SqlMapClient client = IBatisUtil.getSqlMapClient();
		client.insert("registerUser", dto);
	}//end insert
	
	public List<UserDto>  list() throws ClassNotFoundException, SQLException{
		SqlMapClient client = IBatisUtil.getSqlMapClient();
		return client.queryForList("selectAllUsers", client);
	}

	
	public UserDto findById( String usrid ) throws ClassNotFoundException, SQLException{
		SqlMapClient client = IBatisUtil.getSqlMapClient();
		return (UserDto)client.queryForObject("selectUser",usrid);
	}
	
	public void update( UserDto dto ) throws ClassNotFoundException, SQLException{
		SqlMapClient client = IBatisUtil.getSqlMapClient();
		client.update("updateUser", dto);
	}
	
	public void delete( String usrid) throws ClassNotFoundException, SQLException{
		SqlMapClient client = IBatisUtil.getSqlMapClient();
		client.delete("deleteUser",usrid);
	}
	
	
	
}//end class
















