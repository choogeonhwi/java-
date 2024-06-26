package com.lgy.spring_mvc_board_jdbc.dao;

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
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.lgy.spring_mvc_board_jdbc.dto.*;
import com.lgy.spring_mvc_board_jdbc.util.Constant;

public class BDao {
//	DataSource dataSource;
	JdbcTemplate template=null;
	
	public BDao() {
//		try {
//			Context context = new InitialContext();
//			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		Constant.template : 컨트롤러에서 설정됨
		template = Constant.template;
	}
	
	public ArrayList<BDto> list() {
		ArrayList<BDto> dtos=null;
		String sql="select bid, bname, btitle, bcontent, bdate, bhit from mvc_board";
//		query : jdbc template 쿼리 처리
		dtos = (ArrayList<BDto>) template.query(sql, new BeanPropertyRowMapper(BDto.class));
		return dtos;
		
		/*
		ArrayList<BDto> dtos=new ArrayList<BDto>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn = dataSource.getConnection();
			String sql="select bid, bname, btitle, bcontent, bdate, bhit from mvc_board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				
				BDto dto = new BDto(bid, bname, btitle, bcontent, bdate, bhit);
				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dtos;
		*/
	}
	
	public void write(final String bname, final String btitle, final String bcontent) {
//		update : jdbc template 으로 insert (PreparedStatementCreator 객체 사용)
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql="insert into mvc_board(bid, bname, btitle, bcontent, bhit) "
						+ "values(MVC_BOARD_SEQ.NEXTVAL,?,?,?,0)";
//				con : 메소드 매개변수와 이름 일치
				PreparedStatement pstmt = con.prepareStatement(sql);
//				bname 파라미터 등은 final로 구성
				pstmt.setString(1, bname);
				pstmt.setString(2, btitle);
				pstmt.setString(3, bcontent);
				return pstmt;
			}
		});
		/*
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn = dataSource.getConnection();
			String sql="insert into mvc_board(bid, bname, btitle, bcontent, bhit) "
					+ "values(MVC_BOARD_SEQ.NEXTVAL,?,?,?,0)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		*/
	}
	
	public BDto contentView(String strID) {
		upHit(strID);
		
//		String sql="select bid, bname, btitle, bcontent, bdate, bhit from mvc_board where bid=?";
		String sql="select bid, bname, btitle, bcontent, bdate, bhit from mvc_board where bid="+strID;
//		return (BDto) template.query(sql, new BeanPropertyRowMapper(BDto.class));//오류
		return (BDto) template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
		
		/*
		BDto dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn = dataSource.getConnection();
			String sql="select bid, bname, btitle, bcontent, bdate, bhit from mvc_board where bid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(strID));
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				
				dto = new BDto(bid, bname, btitle, bcontent, bdate, bhit);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return dto;
		*/
	}
	
	public void upHit(final String bid) {
		String sql="update mvc_board set bhit=bhit+1 where bid=?";
//		update : sql update(PreparedStatementSetter 객체 사용)
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bid));
			}
		});
		/*
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn = dataSource.getConnection();
			String sql="update mvc_board set bhit=bhit+1 where bid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(bid));
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		*/
	}
	
	public void modify(final String bid, final String bname, final String btitle, final String bcontent) {
		String sql="update mvc_board set bname=?, btitle=?, bcontent=? where bid=?";
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, bname);
				ps.setString(2, btitle);
				ps.setString(3, bcontent);
				ps.setInt(4, Integer.parseInt(bid));
			}
		});
		/*
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn = dataSource.getConnection();
			String sql="update mvc_board set bname=?, btitle=?, bcontent=? where bid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setString(2, btitle);
			pstmt.setString(3, bcontent);
			pstmt.setInt(4, Integer.parseInt(bid));
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		*/
	}
	
	public void delete(final String strID) {
		String sql="delete from mvc_board where bid=?";
//		update : jdbc template 삭제 처리
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(strID));
			}
		});
		/*
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn = dataSource.getConnection();
			String sql="delete from mvc_board where bid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(strID));
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	*/
	}
}
