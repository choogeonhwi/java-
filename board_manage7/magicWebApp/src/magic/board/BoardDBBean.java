package magic.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import magic.member.MemberBean;

public class BoardDBBean {
	private static BoardDBBean instance=new BoardDBBean();
	
	public static BoardDBBean getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		return ((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
	}
	
	public int insertBoard(BoardBean board) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		int re=-1;//초기값 -1, insert 정상적으로 실행되면 1
		int number;
//		매개변수로 받은 member 객체를 ? 인 쿼리 파라미터에 매핑
//		String sql="INSERT INTO boardT VALUES(?,?,?,?)";
		String sql="";
		
			try {
//				dbcp 기법의 연결 객체
				conn = getConnection();
				/*
				String sql2="SELECT max(b_id) FROM boardT";
				pstmt = conn.prepareStatement(sql2);
				rs = pstmt.executeQuery();
				
//				글번호 최대값+1을 구함: null 일때는 1, 아니면 +1
				if (rs.next()) {
					number = rs.getInt(1) + 1;
				} else {
					number = 1;
				}
				*/
				
//				sql="INSERT INTO boardT VALUES(?,?,?,?,?)";
//				sql="INSERT INTO boardT(b_id, b_name, b_email, b_title, b_content) "
//						+ "VALUES((SELECT max(b_id)+1 FROM boardT),?,?,?,?)";
//				sql="INSERT INTO boardT(b_id, b_name, b_email, b_title, b_content) "
//						+ "VALUES((SELECT nvl(max(b_id),0)+1 FROM boardT),?,?,?,?)";
//				sql="INSERT INTO boardT(b_id, b_name, b_email, b_title, b_content, b_date) "
//						+ "VALUES((SELECT nvl(max(b_id),0)+1 FROM boardT),?,?,?,?,?)";
//				sql="INSERT INTO boardT(b_id, b_name, b_email, b_title, b_content, b_date, b_pwd) "
//						+ "VALUES((SELECT nvl(max(b_id),0)+1 FROM boardT),?,?,?,?,?,?)";
				sql="INSERT INTO boardT(b_id, b_name, b_email, b_title, b_content, b_date, b_pwd, b_ip) "
						+ "VALUES((SELECT nvl(max(b_id),0)+1 FROM boardT),?,?,?,?,?,?,?)";
				
				pstmt = conn.prepareStatement(sql);
//				pstmt.setInt(1, number);
				pstmt.setString(1, board.getB_name());
				pstmt.setString(2, board.getB_email());
				pstmt.setString(3, board.getB_title());
				pstmt.setString(4, board.getB_content());
				pstmt.setTimestamp(5, board.getB_date());
				pstmt.setString(6, board.getB_pwd());
				pstmt.setString(7, board.getB_ip());
//				pstmt.setString(2, board.getB_name());
//				pstmt.setString(3, board.getB_email());
//				pstmt.setString(4, board.getB_title());
//				pstmt.setString(5, board.getB_content());
				
//				INSERT 문은 executeUpdate 메소드 호출
				re = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try{
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
		
		return re;
	}
	
	public ArrayList<BoardBean> listBoard() {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
//		String sql="SELECT b_id, b_name, b_email, b_title, b_content FROM boardT ORDER BY b_id";
//		String sql="SELECT b_id, b_name, b_email, b_title, b_content, b_date FROM boardT ORDER BY b_id";
//		String sql="SELECT b_id, b_name, b_email, b_title, b_content, b_date, b_hit FROM boardT ORDER BY b_id";
//		String sql="SELECT b_id, b_name, b_email, b_title, b_content, b_date, b_hit, b_pwd FROM boardT ORDER BY b_id";
		String sql="SELECT b_id, b_name, b_email, b_title, b_content, b_date, b_hit, b_pwd, b_ip FROM boardT ORDER BY b_id";
		ArrayList<BoardBean> boardList=new ArrayList<BoardBean>();
		
			try {
//				dbcp 기법의 연결 객체
				conn = getConnection();
				pstmt = conn.prepareStatement(sql);
//				SELECT 문은 executeQuery 메소드 호출
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					BoardBean board=new BoardBean();
					
//					쿼리 결과를 BoardBean 객체에 담아서 ArrayList 에 저장
					board.setB_id(rs.getInt(1));
					board.setB_name(rs.getString(2));
					board.setB_email(rs.getString(3));
					board.setB_title(rs.getString(4));
					board.setB_content(rs.getString(5));
					board.setB_date(rs.getTimestamp(6));
					board.setB_hit(rs.getInt(7));
					board.setB_pwd(rs.getString(8));
					board.setB_ip(rs.getString(9));
//					여기까지가 1행을 가져와서 저장
					
//					행의 데이터를 ArrayList 에 저장
					boardList.add(board);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try{
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
		
		return boardList;
	}
	
//	public BoardBean getBoard(int bid) {
//	hitadd : 참일때만 조회수 증가
	public BoardBean getBoard(int bid, boolean hitadd) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
//		String sql="SELECT b_id, b_name, b_email, b_title, b_content FROM boardT WHERE b_id=?";
		String sql="";
		BoardBean board=null;
		
			try {
//				dbcp 기법의 연결 객체
				conn = getConnection();
				
				if (hitadd) {
//					조회수 1증가 SQL
					sql="UPDATE boardT SET b_hit=b_hit+1 WHERE b_id=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, bid);
					pstmt.executeUpdate();
				}
				
//				글내용 보기(+수정)
//				sql="SELECT b_id, b_name, b_email, b_title, b_content, b_date FROM boardT WHERE b_id=?";
//				sql="SELECT b_id, b_name, b_email, b_title, b_content, b_date, b_hit FROM boardT WHERE b_id=?";
//				sql="SELECT b_id, b_name, b_email, b_title, b_content, b_date, b_hit, b_pwd FROM boardT WHERE b_id=?";
				sql="SELECT b_id, b_name, b_email, b_title, b_content, b_date, b_hit, b_pwd, b_ip FROM boardT WHERE b_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, bid);
//				SELECT 문은 executeQuery 메소드 호출
				rs = pstmt.executeQuery();
				
				if (rs.next()) {
					board=new BoardBean();
					
					board.setB_id(rs.getInt(1));
					board.setB_name(rs.getString(2));
					board.setB_email(rs.getString(3));
					board.setB_title(rs.getString(4));
					board.setB_content(rs.getString(5));
					board.setB_date(rs.getTimestamp(6));
					board.setB_hit(rs.getInt(7));
					board.setB_pwd(rs.getString(8));
					board.setB_ip(rs.getString(9));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try{
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
		
		return board;
	}
	
	public int deleteBoard(int b_id, String b_pwd) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int re=-1;
		String sql="";
		String pwd="";
		
			try {
				conn = getConnection();
//				글번호로 비밀번호 조회
				sql="SELECT b_pwd FROM boardT WHERE b_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, b_id);
				rs = pstmt.executeQuery();
				
				if (rs.next()) {
//					쿼리결과에서 b_pwd 컬럼 데이터
					pwd = rs.getString(1);
					if (pwd.equals(b_pwd)) {//비밀번호가 일치
						sql="DELETE FROM boardT WHERE b_id=?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, b_id);
						pstmt.executeUpdate();
						re=1;//삭제함
					} else {
						re=0;//삭제안함
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try{
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
			}
		
		return re;
	}
	
//	수정할 내용을 BoardBean 타입의 객체로 받는다.
	public int editBoard(BoardBean board) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int re=-1;
		String sql="";
		String pwd="";
		
		try {
			conn = getConnection();
//				글번호로 비밀번호 조회
			sql="SELECT b_pwd FROM boardT WHERE b_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getB_id());
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
//					쿼리결과에서 b_pwd 컬럼 데이터
				pwd = rs.getString(1);
				if (pwd.equals(board.getB_pwd())) {//비밀번호가 일치
					sql="UPDATE boardT SET b_name=?,  b_email=?, b_title=?, b_content=? WHERE b_id=?";
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setString(1, board.getB_name());
					pstmt.setString(2, board.getB_email());
					pstmt.setString(3, board.getB_title());
					pstmt.setString(4, board.getB_content());
					pstmt.setInt(5, board.getB_id());
					
					pstmt.executeUpdate();
					re=1;//수정함
				} else {
					re=0;//수정안함
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		
		return re;
	}
}


















