package com.lgy.spring_test_item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.lgy.spring_test_item.ItemDto;

public class ItemDao {
DataSource dataSource;
	
	public ItemDao() {
//		dbcp 방식으로 oracle 연결
		try {
			Context context = new InitialContext();
//			context.xml 에 설정(server.xml 과 달리 한번 설정으로 모든 프로젝트에서 사용가능)
//			dataSource : 조회,저장,수정,삭제 쿼리에 모두 사용 가능
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//게시판 목록 조회
	public ArrayList<ItemDto> content_view() {
		ArrayList<ItemDto> dtos=new ArrayList<ItemDto>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			conn = dataSource.getConnection();
			String sql="select bname,bp,bcontent from mvc_board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				String bname = rs.getString("bname");
				int bp = rs.getInt("bp");
				String bcontent = rs.getString("bcontent");
			
				
//				하나의 게시글 객체
				ItemDto dto = new ItemDto(bname,bp,bcontent);
//				게시글을 추가(dtos : 여러 게시글이 될수 있음)
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
	}
	
	public void write(String bname, int bp, String bcontent) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn = dataSource.getConnection();
			String sql="insert into mvc_board(bname,bp,bcontent) "
					+ "values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bname);
			pstmt.setInt(2, bp);
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
	}
	


}
