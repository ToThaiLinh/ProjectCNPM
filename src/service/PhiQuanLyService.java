package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.PhiQuanLy;

public class PhiQuanLyService implements DAOInterface<PhiQuanLy>{
	
	public PhiQuanLyService() {
		
	}
	
	public static PhiQuanLyService getInstance() {
		return new PhiQuanLyService();
	}

	@Override
	public int insert(PhiQuanLy t) {
		int sodongdathem = 0;
		try {
			Connection conn = JDBC.getConnection();
			String query = "INSERT INTO PHIQUANLY VALUES (?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, t.getMaPhiQuanLy());
			pst.setDouble(2,  t.getVanHanh());
			pst.setString(3,  t.getTinhTrang());
			
			sodongdathem = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdathem;
	}

	@Override
	public int update(PhiQuanLy t) {
		int sodongdasua = 0;
		String maPhiQuanLy = t.getMaPhiQuanLy();
		try {
			Connection conn = JDBC.getConnection();
			String query = "UPDATE PHIQUANLY SET MaPhiQuanLy = ?, VanHanh = ?, TinhTrang = ? WHERE MaPhiQuanLy = ? ";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, t.getMaPhiQuanLy());
			pst.setDouble(2,  t.getVanHanh());
			pst.setString(3,  t.getTinhTrang());
			pst.setString(4,  maPhiQuanLy);
			
			sodongdasua = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdasua;
	}

	@Override
	public int delete(PhiQuanLy t) {
		int sodongdaxoa = 0;
		String maPhiQuanLy = t.getMaPhiQuanLy();
		try {
			Connection conn = JDBC.getConnection();
			String query = "DELETE FROM PHIQUANLY WHERE MaPhiQuanLy = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  maPhiQuanLy);
			sodongdaxoa = pst.executeUpdate();
			
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdaxoa;
	}

	@Override
	public ArrayList<PhiQuanLy> selectAll() {
		ArrayList<PhiQuanLy> dsPhiQuanLy = new ArrayList<PhiQuanLy>();
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM PHIQUANLY");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhiQuanLy = rs.getString("MaPhiQuanLy");
				double vanHanh = rs.getDouble("VanHanh");
				String tinhTrang = rs.getString("TinhTrang");
				
				PhiQuanLy pql = new PhiQuanLy(maPhiQuanLy, vanHanh, tinhTrang);
				dsPhiQuanLy.add(pql);
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsPhiQuanLy;
	}

	@Override
	public PhiQuanLy selectByID(PhiQuanLy t) {
		PhiQuanLy pql = null;
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM PHIQUANLY WHERE MaPhiQuanLy = ?");
			pst.setString(1, t.getMaPhiQuanLy());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhiQuanLy = rs.getString("MaPhiQuanLy");
				double vanHanh = rs.getDouble("VanHanh");
				String tinhTrang = rs.getString("TinhTrang");
				
				pql = new PhiQuanLy(maPhiQuanLy, vanHanh, tinhTrang);
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pql;
	}

	@Override
	public ArrayList<PhiQuanLy> selectByCondition(String condition) {
		ArrayList<PhiQuanLy> dsPhiQuanLy = new ArrayList<PhiQuanLy>();
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM PHIQUANLY " + condition);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhiQuanLy = rs.getString("MaPhiQuanLy");
				double vanHanh = rs.getDouble("VanHanh");
				String tinhTrang = rs.getString("TinhTrang");
				
				PhiQuanLy pql = new PhiQuanLy(maPhiQuanLy, vanHanh, tinhTrang);
				dsPhiQuanLy.add(pql);
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsPhiQuanLy;
	}

}
