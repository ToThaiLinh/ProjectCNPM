package service;

import model.PhiDichVu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PhiDichVuService implements DAOInterface<PhiDichVu> {

	@Override
	public int insert(PhiDichVu t) {
		int sodongdathem = 0;
		try {
			Connection conn = JDBC.getConnection();
			String query = "INSERT INTO PHIDICHVU VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, t.getMaPhiDichVu());
			pst.setDouble(2, t.getVeSinh());
			pst.setDouble(3, t.getBaoTri());
			pst.setDouble(4, t.getSinhHoatChung());
			pst.setDouble(5,  t.getAnNinh());
			pst.setString(6, t.getTinhTrang());
			
			sodongdathem = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdathem;
	}

	@Override
	public int update(PhiDichVu t) {
		int sodongdasua = 0;
		String maPhiDichVu = t.getMaPhiDichVu();
		try {
			Connection conn = JDBC.getConnection();
			String query = "UPDATE PHIDICHVU SET MaPhiDichVu = ?, VeSinh = ?, BaoTri = ?, SinhHoatChung = ?, AnNinh = ?, TinhTrang = ?"
					+ " WHERE MaPhiDichVu = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, t.getMaPhiDichVu());
			pst.setDouble(2, t.getVeSinh());
			pst.setDouble(3, t.getBaoTri());
			pst.setDouble(4, t.getSinhHoatChung());
			pst.setDouble(5,  t.getAnNinh());
			pst.setString(6, t.getTinhTrang());
			pst.setString(7, maPhiDichVu);
			
			sodongdasua = pst.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdasua;
	}

	@Override
	public int delete(PhiDichVu t) {
		int sodongdaxoa = 0;
		String maPhiDichVu = t.getMaPhiDichVu();
		try {
			Connection conn = JDBC.getConnection();
			String query = "DELETE FROM PHIDICHVU WHERE MaPhiDichVu = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1,  maPhiDichVu);
			sodongdaxoa = pst.executeUpdate();
			
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return sodongdaxoa;
	}

	@Override
	public ArrayList<PhiDichVu> selectAll() {
		ArrayList<PhiDichVu> dsPhiDichVu = new ArrayList<PhiDichVu>();
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM PHIDICHVU");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhiDichVu = rs.getString("MaPhiDichVu");
				double veSinh = rs.getDouble("VeSinh");
				double baoTri = rs.getDouble("BaoTri");
				double sinhHoatChung = rs.getDouble("SinhHoatChung");
				double anNinh = rs.getDouble("AnNinh");
				String tinhTrang = rs.getString("TinhTrang");
				
				PhiDichVu pdv = new PhiDichVu(maPhiDichVu, veSinh, baoTri, sinhHoatChung, anNinh, tinhTrang);
				dsPhiDichVu.add(pdv);
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsPhiDichVu;
	}

	@Override
	public PhiDichVu selectByID(PhiDichVu t) {
		PhiDichVu pdv = null;
		String maPhiDichVu = t.getMaPhiDichVu();
		try {
			Connection conn = JDBC.getConnection();
			String query = "SELECT * FROM PHIDICHVU WHERE MaPhiDichVu = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setString(1, maPhiDichVu);
			ResultSet rs = pst.executeQuery();
			pdv = new PhiDichVu(rs.getString("MaPhiDichVu"), rs.getDouble("VeSinh"), rs.getDouble("BaoTri"), rs.getDouble("SinhHoatChung"), rs.getDouble("AnNinh"), rs.getString("TinhTrang"));
			conn.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pdv;
	}

	@Override
	public ArrayList<PhiDichVu> selectByCondition(String condition) {
		ArrayList<PhiDichVu> dsPhiDichVu = new ArrayList<PhiDichVu>();
		try {
			Connection conn = JDBC.getConnection();
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM PHIDICHVU" + condition);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maPhiDichVu = rs.getString("MaPhiDichVu");
				double veSinh = rs.getDouble("VeSinh");
				double baoTri = rs.getDouble("BaoTri");
				double sinhHoatChung = rs.getDouble("SinhHoatChung");
				double anNinh = rs.getDouble("AnNinh");
				String tinhTrang = rs.getString("TinhTrang");
				
				PhiDichVu pdv = new PhiDichVu(maPhiDichVu, veSinh, baoTri, sinhHoatChung, anNinh, tinhTrang);
				dsPhiDichVu.add(pdv);
				
			}
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dsPhiDichVu;
	}

}
