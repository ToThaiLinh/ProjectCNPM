package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.QuanLy;

public class QuanLyService implements DAOInterface<QuanLy> {
	
	public QuanLyService() {
		
	}
	
	public static QuanLyService getInstance() {
		return new QuanLyService();
	}

	@Override
	public int insert(QuanLy t) {
		int sodongdathem = 0;
		try {
			Connection conn = JDBC.getConnection();
			String query = "INSERT INTO QUANLY VALUES (?, ?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  t.getMaQTV());
			pst.setString(2,  t.getMaHK());
			sodongdathem = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdathem;
	}

	@Override
	public int update(QuanLy t) {
		int sodongdasua = 0;
		String maQTV = t.getMaQTV();
		String maHK = t.getMaHK();
		try {
			Connection conn = JDBC.getConnection();
			String query = "UPDATE QUANLY SET MaQTV = ?, MaHK = ? WHERE MaQTV = ? AND MaHK = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  t.getMaQTV());
			pst.setString(2,  t.getMaHK());
			pst.setString(3, maQTV);
			pst.setString(4,  maHK);
			sodongdasua = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdasua;
	}

	@Override
	public int delete(QuanLy t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<QuanLy> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuanLy selectByID(QuanLy t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<QuanLy> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
}