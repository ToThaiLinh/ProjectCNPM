package service;

import service.JDBC;
import model.HoKhau;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class HoKhauService implements DAOInterface<HoKhau> {

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
			pst.setString(4,  t.getDienTich() + "");
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
			pst.setString(4,  t.getDienTich() + "");
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
			String query = "INSERT INTO HOKHAU VALUES (?, ?, ?, ?, ?, ?, ?)";
			pst = conn.prepareStatement(query);
			
			pst.setString(1, t.getMaHK());
			pst.setString(2, t.getHoTenChuHo());
			pst.setString(3, t.getDiaChi());
			pst.setString(4,  t.getDienTich() + "");
			pst.setString(5, t.getChatLuong());
			pst.setString(6,  t.getNgayTaoHoKhau() + "");
			pst.setString(7, t.getNgaySuaHoKhau() + "");
			
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HoKhau selectByID(HoKhau t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HoKhau> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
