package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.LaChuHo;

public class LaChuHoService implements DAOInterface<LaChuHo> {
	public LaChuHoService() {
		
	}
	
	public static LaChuHoService getInstance() {
		return new LaChuHoService();
	}

	@Override
	public int insert(LaChuHo t) {
		int sodongdathem = 0;
		try {
			Connection conn = JDBC.getConnection();
			String query = "INSERT INTO LACHUHO VALUES (?, ?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  t.getMaHK());
			pst.setString(2,  t.getMaNK());
			sodongdathem = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdathem;
	}

	@Override
	public int update(LaChuHo t) {
		int sodongdasua = 0;
		String maHK = t.getMaHK();
		String maNK = t.getMaNK();
		try {
			Connection conn = JDBC.getConnection();
			String query = "UPDATE LACHUHO SET MaHK = ?, MaNK = ? WHERE MaHK = ? AND MaNK = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  t.getMaHK());
			pst.setString(2,  t.getMaNK());
			pst.setString(3, maHK);
			pst.setString(4,  maNK);
			sodongdasua = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdasua;
	}

	@Override
	public int delete(LaChuHo t) {
		int sodongdaxoa = 0;
		try {
			Connection conn = JDBC.getConnection();
			String query = "DELETE FROM LACHUHO WHERE MaHK = ? AND MaNK = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  t.getMaHK());
			pst.setString(2,  t.getMaNK());
			sodongdaxoa = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdaxoa;
	}

	@Override
	public ArrayList<LaChuHo> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LaChuHo selectByID(LaChuHo t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LaChuHo> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
