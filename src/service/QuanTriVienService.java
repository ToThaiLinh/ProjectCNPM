package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;

import model.QuanTriVien;

public class QuanTriVienService implements DAOInterface<QuanTriVien> {
	
	public QuanTriVienService() {
		
	}
	
	public static QuanTriVienService getInstance() {
		return new QuanTriVienService();
	}

	@Override
	public int insert(QuanTriVien t) {
		int sodongdachen = 0;
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = null;
			String query = "INSERT INTO QUANTRIVIEN VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			pst = conn.prepareStatement(query);
			
			pst.setString(1, t.getMaQTV());
			pst.setString(2,  t.getCccd());
			pst.setString(3,  t.getHoTen());
			pst.setString(4,  t.getNgaySinh() + "");
			pst.setString(5, t.getGioiTinh());
			pst.setString(6,  t.getSdt());
			pst.setString(7, t.getEmail());
			pst.setString(8,  t.getDiaChi());
			pst.setString(9, t.getTenTaiKhoan());
			pst.setString(10, t.getMatKhau());
			
			sodongdachen = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return sodongdachen;
	}

	@Override
	public int update(QuanTriVien t) {
		int sodongdacapnhat = 0;
		try {
			String maqtv = t.getMaQTV();
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = null;
			String query = "UPDATE QUANTRIVIEN SET MaQTV = ?, CCCD = ?, HoTen = ?, NgaySinh = ?, "
					+ "GioiTinh = ?, SDT = ?, Email = ?, DiaChi = ?, TenTaiKhoan = ?, MatKhau = ?"					
					+ " WHERE maQTV = ?";
			pst = conn.prepareStatement(query);
			
			pst.setString(1, t.getMaQTV());
			pst.setString(2,  t.getCccd());
			pst.setString(3,  t.getHoTen());
			pst.setString(4,  t.getNgaySinh() + "");
			pst.setString(5, t.getGioiTinh());
			pst.setString(6,  t.getSdt());
			pst.setString(7, t.getEmail());
			pst.setString(8,  t.getDiaChi());
			pst.setString(9, t.getTenTaiKhoan());
			pst.setString(10, t.getMatKhau());
			pst.setString(11,  maqtv);
			
			sodongdacapnhat = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return sodongdacapnhat;
	}

	@Override
	public int delete(QuanTriVien t) {
		int sodongdaxoa = 0;
		try {
			String maqtv = t.getMaQTV();
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = null;
			String query = "DELETE FROM QUANTRIVIEN WHERE MaQTV = ?";
			pst = conn.prepareStatement(query);
			
			pst.setString(1,  maqtv);
			
			sodongdaxoa = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return sodongdaxoa;
		
	}

	@Override
	public ArrayList<QuanTriVien> selectAll() {
		ArrayList<QuanTriVien> dsQTV = new ArrayList<QuanTriVien>();
		try {
			Connection conn = JDBC.getConnection();
			String query = "SELECT * FROM QUANTRIVIEN";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maQTV = rs.getString("MaQTV");
				String cccd = rs.getString("CCCD");
				String hoTen = rs.getString("HoTen");
				Date ngaySinh = rs.getDate("NgaySinh");
				String gioiTinh = rs.getString("GioiTinh");
				String sdt = rs.getString("SDT");
				String email = rs.getString("Email");
				String diaChi = rs.getString("DiaChi");
				String tenTaiKhoan = rs.getString("TenTaiKhoan");
				String matKhau = rs.getString("MatKhau");
				
				QuanTriVien qtv = new QuanTriVien(maQTV, cccd, hoTen, ngaySinh, gioiTinh, sdt, email, diaChi, tenTaiKhoan, matKhau);
				dsQTV.add(qtv);
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsQTV;
	}

	@Override
	public QuanTriVien selectByID(QuanTriVien t) {
		QuanTriVien qtv = null;
		try {
			Connection conn = JDBC.getConnection();
			String query = "SELECT * FROM QUANTRIVIEN WHERE MaQTV = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, t.getMaQTV());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maQTV = rs.getString("MaQTV");
				String cccd = rs.getString("CCCD");
				String hoTen = rs.getString("HoTen");
				Date ngaySinh = rs.getDate("NgaySinh");
				String gioiTinh = rs.getString("GioiTinh");
				String sdt = rs.getString("SDT");
				String email = rs.getString("Email");
				String diaChi = rs.getString("DiaChi");
				String tenTaiKhoan = rs.getString("TenTaiKhoan");
				String matKhau = rs.getString("MatKhau");
				
				qtv = new QuanTriVien(maQTV, cccd, hoTen, ngaySinh, gioiTinh, sdt, email, diaChi, tenTaiKhoan, matKhau);
				
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return qtv;
	}

	@Override
	public ArrayList<QuanTriVien> selectByCondition(String condition) {
		ArrayList<QuanTriVien> dsQTV = new ArrayList<QuanTriVien>();
		try {
			Connection conn = JDBC.getConnection();
			String query = "SELECT * FROM QUANTRIVIEN WHERE " + condition;
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maQTV = rs.getString("MaQTV");
				String cccd = rs.getString("CCCD");
				String hoTen = rs.getString("HoTen");
				Date ngaySinh = rs.getDate("NgaySinh");
				String gioiTinh = rs.getString("GioiTinh");
				String sdt = rs.getString("SDT");
				String email = rs.getString("Email");
				String diaChi = rs.getString("DiaChi");
				String tenTaiKhoan = rs.getString("TenTaiKhoan");
				String matKhau = rs.getString("MatKhau");
				
				QuanTriVien qtv = new QuanTriVien(maQTV, cccd, hoTen, ngaySinh, gioiTinh, sdt, email, diaChi, tenTaiKhoan, matKhau);
				dsQTV.add(qtv);
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsQTV;
	}
	

}
