package model;

public class PhiKhac {
	private String maPhiKhac;
	private double quyBienDao;
	private double quyKhuyenHoc;
	private double quyTuThien;
	private String tinhTrang;
	
	public PhiKhac() {
		
	}

	public PhiKhac(String maPhiKhac, double quyBienDao, double quyKhuyenHoc, double quyTuThien, String tinhTrang) {
		super();
		this.maPhiKhac = maPhiKhac;
		this.quyBienDao = quyBienDao;
		this.quyKhuyenHoc = quyKhuyenHoc;
		this.quyTuThien = quyTuThien;
		this.tinhTrang = tinhTrang;
	}

	public String getMaPhiKhac() {
		return maPhiKhac;
	}

	public void setMaPhiKhac(String maPhiKhac) {
		this.maPhiKhac = maPhiKhac;
	}

	public double getQuyBienDao() {
		return quyBienDao;
	}

	public void setQuyBienDao(double quyBienDao) {
		this.quyBienDao = quyBienDao;
	}

	public double getQuyKhuyenHoc() {
		return quyKhuyenHoc;
	}

	public void setQuyKhuyenHoc(double quyKhuyenHoc) {
		this.quyKhuyenHoc = quyKhuyenHoc;
	}

	public double getQuyTuThien() {
		return quyTuThien;
	}

	public void setQuyTuThien(double quyTuThien) {
		this.quyTuThien = quyTuThien;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
}
