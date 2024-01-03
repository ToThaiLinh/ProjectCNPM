package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.DongPhi;

public class DongPhiService implements DAOInterface<DongPhi> {
	
	public DongPhiService() {
		
	}
	
	public static DongPhiService getInstance() {
		return new DongPhiService();
	}

	@Override
	public int insert(DongPhi t) {
		int sodongdathem = 0;
		try {
			Connection conn = JDBC.getConnection();
			String query = "INSERT INTO QUANLY VALUES (?, ?. ?, ?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  t.getMaHK());
			pst.setString(2,  t.getMaPhiQuanLy());
			pst.setString(3, t.getMaPhiKhac());
			pst.setString(4,  t.getMaPhiDichVu());
			
			sodongdathem = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdathem;
	}

	@Override
	public int update(DongPhi t) {
		int sodongdasua = 0;
		try {
			Connection conn = JDBC.getConnection();
			String query = "UPDATE DONGPHI SET MaHK = ?, MaPhiQuanLy = ?, MaPhiKhac = ?, MaPhiDichVu = ? WHERE MaHK = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  t.getMaHK());
			pst.setString(2,  t.getMaPhiQuanLy());
			pst.setString(3, t.getMaPhiKhac());
			pst.setString(4,  t.getMaPhiDichVu());
			pst.setString(5,  t.getMaHK());
			
			sodongdasua = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdasua;
	}

	@Override
	public int delete(DongPhi t) {
		int sodongdaxoa = 0;
		try {
			Connection conn = JDBC.getConnection();
			String query = "DELETE FROM DONGPHI WHERE MaHK = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  t.getMaHK());
			sodongdaxoa = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdaxoa;
	}

	@Override
	public ArrayList<DongPhi> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DongPhi selectByID(DongPhi t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<DongPhi> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
