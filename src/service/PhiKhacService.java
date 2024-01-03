package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.PhiKhac;

public class PhiKhacService implements DAOInterface<PhiKhac> {

	@Override
	public int insert(PhiKhac t) {
		int sodongdathem = 0;
		try {
			Connection conn = JDBC.getConnection();
			String query = "INSERT INTO PHIKHAC VALUES (?, ?, ?, ? ?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  t.getMaPhiKhac());
			pst.setDouble(2, t.getQuyBienDao());
			pst.setDouble(3, t.getQuyKhuyenHoc());
			pst.setDouble(4,  t.getQuyTuThien());
			pst.setString(5, t.getTinhTrang());
			
			sodongdathem = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdathem;
	}

	@Override
	public int update(PhiKhac t) {
		int sodongdasua = 0;
		String maPhiKhac = t.getMaPhiKhac();
		try {
			Connection conn = JDBC.getConnection();
			String query = "UPDATE PHIKHAC SET MaPhiKhac = ?, QuyBienDao = ?, QuyKhuyenHoc = ?, QuyTuThien = ?, TinhTrang = ? WHERE MaPhiKhac = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  t.getMaPhiKhac());
			pst.setDouble(2, t.getQuyBienDao());
			pst.setDouble(3, t.getQuyKhuyenHoc());
			pst.setDouble(4,  t.getQuyTuThien());
			pst.setString(5, t.getTinhTrang());
			pst.setString(6, maPhiKhac);
			
			sodongdasua = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdasua;
	}

	@Override
	public int delete(PhiKhac t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<PhiKhac> selectAll() {
		ArrayList<PhiKhac> dsPhiKhac = new ArrayList<PhiKhac>();
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM PHIKHAC");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhiKhac = rs.getString("MaPhiKhac");
				double quyBienDao = rs.getDouble("QuyBienDao");
				double quyKhuyenHoc = rs.getDouble("QuyKhuyenHoc");
				double quyTuThien = rs.getDouble("QuyTuThien");
				String tinhTrang = rs.getString("TinhTrang");
				
				PhiKhac pk = new PhiKhac(maPhiKhac, quyBienDao, quyKhuyenHoc, quyTuThien, tinhTrang);
				dsPhiKhac.add(pk);
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsPhiKhac;
	}

	@Override
	public PhiKhac selectByID(PhiKhac t) {
		PhiKhac pk = null;
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM PHIKHAC WHERE MaPhiKhac = ?");
			pst.setString(1, t.getMaPhiKhac());
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhiKhac = rs.getString("MaPhiKhac");
				double quyBienDao = rs.getDouble("QuyBienDao");
				double quyKhuyenHoc = rs.getDouble("QuyKhuyenHoc");
				double quyTuThien = rs.getDouble("QuyTuThien");
				String tinhTrang = rs.getString("TinhTrang");
				
				pk = new PhiKhac(maPhiKhac, quyBienDao, quyKhuyenHoc, quyTuThien, tinhTrang);
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pk;
	}

	@Override
	public ArrayList<PhiKhac> selectByCondition(String condition) {
		ArrayList<PhiKhac> dsPhiKhac = new ArrayList<PhiKhac>();
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM PHIKHAC " + condition);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhiKhac = rs.getString("MaPhiKhac");
				double quyBienDao = rs.getDouble("QuyBienDao");
				double quyKhuyenHoc = rs.getDouble("QuyKhuyenHoc");
				double quyTuThien = rs.getDouble("QuyTuThien");
				String tinhTrang = rs.getString("TinhTrang");
				
				PhiKhac pk = new PhiKhac(maPhiKhac, quyBienDao, quyKhuyenHoc, quyTuThien, tinhTrang);
				dsPhiKhac.add(pk);
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsPhiKhac;
	}

}
