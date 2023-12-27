package model;

public class PhiQuanLy {
	private String maPhiQuanLy;
	private double vanHanh;
	private String tinhTrang;
	
	public PhiQuanLy() {
		
	}

	public PhiQuanLy(String maPhiQuanLy, double vanHanh, String tinhTrang) {
		super();
		this.maPhiQuanLy = maPhiQuanLy;
		this.vanHanh = vanHanh;
		this.tinhTrang = tinhTrang;
	}

	public String getMaPhiQuanLy() {
		return maPhiQuanLy;
	}

	public void setMaPhiQuanLy(String maPhiQuanLy) {
		this.maPhiQuanLy = maPhiQuanLy;
	}

	public double getVanHanh() {
		return vanHanh;
	}

	public void setVanHanh(double vanHanh) {
		this.vanHanh = vanHanh;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
}

	