package com.lgy.spring_test_member_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.lgy.spring_test_member_jdbc.MemDto;
import com.lgy.spring_test_member_jdbc.Constant;

public class MemDao {
JdbcTemplate template=null;
	
	public MemDao() {
		template = Constant.template;
	}
	
	public ArrayList<MemDto> loginYn(String id, String pw) {
//		String sql="select mem_pwd from mvc_member where mem_uid=?";
//		String sql="select mem_pwd from mvc_member where mem_uid="+id;
		String sql="select mem_pwd from mem where mem_uid='"+id+"'";
		return (ArrayList<MemDto>) template.query(sql, new BeanPropertyRowMapper(MemDto.class));
	}
	
	public void write(final String mem_uid, final String mem_pwd, final String mem_name) {
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql="insert into mem(mem_uid, mem_pwd, mem_name)"
						+ "values(?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, mem_uid);
				pstmt.setString(2, mem_pwd);
				pstmt.setString(3, mem_name);
				return pstmt;
			}
		});
	}
	

}










