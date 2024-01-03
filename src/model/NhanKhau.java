package model;

import java.sql.Date;

public class NhanKhau {
	private String maNK;
	private String cccd;
	private String hoTen;
	private Date ngaySinh;
	private String gioiTinh;
	
	public NhanKhau(String maNK, String cccd, String hoTen,Date ngaySinh, String gioiTinh) {
		super();
		this.maNK = maNK;
		this.cccd = cccd;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}

	public NhanKhau() {
		
	}

	public String getMaNK() {
		return maNK;
	}

	public void setMaNK(String maNK) {
		this.maNK = maNK;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	
	
	
}
