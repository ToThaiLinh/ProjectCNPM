package service;

import model.HoKhau;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.util.Date;

public class HoKhauService implements DAOInterface<HoKhau> {
	
	public HoKhauService() {
		
	}
	
	public static HoKhauService getInstance() {
		return new HoKhauService();
	}

	@Override
	public int insert(HoKhau t) {
		int sodongdachen = 0;
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = null;
			String query = "INSERT INTO HOKHAU VALUES (?, ?, ?, ?, ?, ?, ?)";
			pst = conn.prepareStatement(query);
			
			pst.setString(1, t.getMaHK());
			pst.setString(2, t.getHoTenChuHo());
			pst.setString(3, t.getDiaChi());
			pst.setDouble(4,  t.getDienTich());
			pst.setString(5, t.getChatLuong());
			pst.setString(6,  t.getNgayTaoHoKhau() + "");
			pst.setString(7, t.getNgaySuaHoKhau() + "");
			
			sodongdachen = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return sodongdachen;
	}

	@Override
	public int update(HoKhau t) {
		int sodongthaydoi = 0;
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = null;
			String query = "UPDATE HOKHAU "
					+ "SET MaHK = ? , HoTenChuHo = ?, DiaChi = ?, DienTich = ?, ChatLuongChungCu = ?, NgaySuaHoKhau = ?, NgayTaoHoKhau = ?"
					+ " WHERE MaHK = ?";
			pst = conn.prepareStatement(query);
			
			pst.setString(1, t.getMaHK());
			pst.setString(2, t.getHoTenChuHo());
			pst.setString(3, t.getDiaChi());
			pst.setDouble(4,  t.getDienTich());
			pst.setString(5, t.getChatLuong());
			pst.setString(6,  t.getNgayTaoHoKhau() + "");
			pst.setString(7, t.getNgaySuaHoKhau() + "");
			pst.setString(8, t.getMaHK());
			
			sodongthaydoi = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongthaydoi;
	}

	@Override
	public int delete(HoKhau t) {
		int so_dong_xoa = 0;
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = null;
			String query = "DELETE FROM HOKHAU WHERE MaHK = ?";
			pst = conn.prepareStatement(query);
			
			pst.setString(1, t.getMaHK());
			
			so_dong_xoa = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return so_dong_xoa;
	}

	@Override
	public ArrayList<HoKhau> selectAll() {
		ArrayList<HoKhau> dsHoKhau = new ArrayList<HoKhau>();
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;
			String query = "SELECT * FROM HOKHAU";
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				String maHK = rs.getString("MaHK");
				String hoTenChuHo = rs.getString("HoTenChuHo");
				String diaChi = rs.getString("DiaChi");
				double dienTich = rs.getDouble("DienTich");
				String chatLuong = rs.getString("ChatLuongChungCu");
				Date ngaySuaHoKhau = rs.getDate("NgaySuaHoKhau");
				Date ngayTaoHoKhau = rs.getDate("NgayTaoHoKhau");
				
				HoKhau hk = new HoKhau(maHK, hoTenChuHo, diaChi, dienTich, chatLuong, ngaySuaHoKhau, ngayTaoHoKhau);
				dsHoKhau.add(hk);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsHoKhau;
	}

	@Override
	public HoKhau selectByID(HoKhau t) {
		HoKhau hk = null;
		try {
			Connection conn = JDBC.getConnection();
			String query = "SELECT * FROM HOKHAU WHERE maHK = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, t.getMaHK() );
			ResultSet rs = pst.executeQuery();
			hk = new HoKhau(rs.getString("MaHK"), rs.getString("HoTenChuHo"), rs.getString("DiaChi"), rs.getDouble("DienTich"),
					rs.getString("ChatLuongChungCu"), rs.getDate("NgaySuaHoKhau"), rs.getDate("NgayTaoHoKhau"));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return hk;
	}

	@Override
	public ArrayList<HoKhau> selectByCondition(String condition) {
		ArrayList<HoKhau> dsHoKhau = new ArrayList<HoKhau>();
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = null;
			ResultSet rs = null;
			String query = "SELECT * FROM HOKHAU WHERE " + condition;
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
				String maHK = rs.getString("MaHK");
				String hoTenChuHo = rs.getString("HoTenChuHo");
				String diaChi = rs.getString("DiaChi");
				double dienTich = rs.getDouble("DienTich");
				String chatLuong = rs.getString("ChatLuongChungCu");
				Date ngaySuaHoKhau = rs.getDate("NgaySuaHoKhau");
				Date ngayTaoHoKhau = rs.getDate("NgayTaoHoKhau");
				
				HoKhau hk = new HoKhau(maHK, hoTenChuHo, diaChi, dienTich, chatLuong, ngaySuaHoKhau, ngayTaoHoKhau);
				dsHoKhau.add(hk);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsHoKhau;
	}
	
}
