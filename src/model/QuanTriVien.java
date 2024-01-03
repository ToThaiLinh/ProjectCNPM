package model;

import java.util.Date;

public class QuanTriVien {
	private String maQTV;
	private String cccd;
	private String hoTen;
	private Date ngaySinh;
	private String gioiTinh;
	private String sdt;
	private String email;
	private String diaChi;
	private String tenTaiKhoan;
	private String matKhau;
	
	public QuanTriVien() {
		
	}

	public QuanTriVien(String maQTV, String cccd, String hoTen, Date ngaySinh, String gioiTinh, String sdt,
			String email, String diaChi, String tenTaiKhoan, String matKhau) {
		super();
		this.maQTV = maQTV;
		this.cccd = cccd;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.sdt = sdt;
		this.email = email;
		this.diaChi = diaChi;
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
	}

	public String getMaQTV() {
		return maQTV;
	}

	public void setMaQTV(String maQTV) {
		this.maQTV = maQTV;
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

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	
	
}
