package service;

import model.NhanKhau;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class NhanKhauService implements DAOInterface<NhanKhau> {
	public NhanKhauService() {
		
	}
	
	public static NhanKhauService getInstance() {
		return new NhanKhauService();
	}

	@Override
	public int insert(NhanKhau t) {
		int sodongdathem = 0;
		try {
			Connection conn = JDBC.getConnection();
			String query = "INSERT INTO NHANKHAU VALUES  (?, ?, ?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setString(1,  t.getMaNK());
			pst.setString(2, t.getCccd());
			pst.setString(3, t.getHoTen());
			pst.setString(4, t.getNgaySinh() +"");
			pst.setString(5, t.getGioiTinh());
			
			sodongdathem = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdathem;
	}

	@Override
	public int update(NhanKhau t) {
		int sodongdasua = 0;
		String maNK = t.getMaNK();
		try {
			Connection conn = JDBC.getConnection();
			String query = "UPDATE NHANKHAU SET MaNK = ?, CCCD = ?, HoTen = ?, NgaySinh = ?, GioiTinh = ? WHERE MaNK = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			
			pst.setString(1,  t.getMaNK());
			pst.setString(2, t.getCccd());
			pst.setString(3, t.getHoTen());
			pst.setString(4, t.getNgaySinh() +"");
			pst.setString(5, t.getGioiTinh());
			pst.setString(6,  maNK);
			
			sodongdasua = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdasua;
	}

	@Override
	public int delete(NhanKhau t) {
		int sodongdaxoa = 0;
		String maNK = t.getMaNK();
		try {
			Connection conn = JDBC.getConnection();
			String query = "DELETE FROM NHANKHAU WHERE MaNK = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  maNK);
			
			sodongdaxoa = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdaxoa;
	}

	@Override
	public ArrayList<NhanKhau> selectAll() {
		ArrayList<NhanKhau> dsNhanKhau = new ArrayList<NhanKhau>();
		try {
			Connection conn = JDBC.getConnection();
			String query = "SELECT * FROM NHANKHAU";
			PreparedStatement pst = conn.prepareStatement(query);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maNK = rs.getString("MaNK");
				String cccd = rs.getString("CCCD");
				String hoTen = rs.getString("HoTen");
				java.sql.Date ngaySinh = rs.getDate("NgaySinh");
				String gioiTinh = rs.getString("GioiTinh");
				
				NhanKhau nk = new NhanKhau(maNK, cccd, hoTen, ngaySinh, gioiTinh);
				dsNhanKhau.add(nk);
			}	
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsNhanKhau;
	}

	@Override
	public NhanKhau selectByID(NhanKhau t) {
		NhanKhau nk = null;
		String maNKtemp = t.getMaNK();
		try {
			Connection conn = JDBC.getConnection();
			String query = "SELECT * FROM NHANKHAU WHERE MaNK = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, maNKtemp);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maNK = rs.getString("MaNK");
				String cccd = rs.getString("CCCD");
				String hoTen = rs.getString("HoTen");
				java.sql.Date ngaySinh = rs.getDate("NgaySinh");
				String gioiTinh = rs.getString("GioiTinh");
				
				nk = new NhanKhau(maNK, cccd, hoTen, ngaySinh, gioiTinh);
			}	
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return nk;
	}

	@Override
	public ArrayList<NhanKhau> selectByCondition(String condition) {
		ArrayList<NhanKhau> dsNhanKhau = new ArrayList<NhanKhau>();
		try {
			Connection conn = JDBC.getConnection();
			String query = "SELECT * FROM NHANKHAU" + condition;
			PreparedStatement pst = conn.prepareStatement(query);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maNK = rs.getString("MaNK");
				String cccd = rs.getString("CCCD");
				String hoTen = rs.getString("HoTen");
				java.sql.Date ngaySinh = rs.getDate("NgaySinh");
				String gioiTinh = rs.getString("GioiTinh");
				
				NhanKhau nk = new NhanKhau(maNK, cccd, hoTen, ngaySinh, gioiTinh);
				dsNhanKhau.add(nk);
			}	
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsNhanKhau;
	}
	
	
}
