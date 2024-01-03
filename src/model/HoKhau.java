package model;

import java.util.Date;

public class HoKhau {

	private String maHK;
	private String hoTenChuHo;
	private String diaChi;
	private double dienTich;
	private String chatLuong;
	private Date ngaySuaHoKhau;
	private Date ngayTaoHoKhau;
	
	public HoKhau() {
		
	}

	public HoKhau(String maHK, String hoTenChuHo, String diaChi, double dienTich, String chatLuong, Date ngaySuaHoKhau,
			Date ngayTaoHoKhau) {
		super();
		this.maHK = maHK;
		this.hoTenChuHo = hoTenChuHo;
		this.diaChi = diaChi;
		this.dienTich = dienTich;
		this.chatLuong = chatLuong;
		this.ngaySuaHoKhau = ngaySuaHoKhau;
		this.ngayTaoHoKhau = ngayTaoHoKhau;
	}

	public String getMaHK() {
		return maHK;
	}

	public void setMaHK(String maHK) {
		this.maHK = maHK;
	}

	public String getHoTenChuHo() {
		return hoTenChuHo;
	}

	public void setHoTenChuHo(String hoTenChuHo) {
		this.hoTenChuHo = hoTenChuHo;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public String getChatLuong() {
		return chatLuong;
	}

	public void setChatLuong(String chatLuong) {
		this.chatLuong = chatLuong;
	}

	public Date getNgaySuaHoKhau() {
		return ngaySuaHoKhau;
	}

	public void setNgaySuaHoKhau(Date ngaySuaHoKhau) {
		this.ngaySuaHoKhau = ngaySuaHoKhau;
	}

	public Date getNgayTaoHoKhau() {
		return ngayTaoHoKhau;
	}

	public void setNgayTaoHoKhau(Date ngayTaoHoKhau) {
		this.ngayTaoHoKhau = ngayTaoHoKhau;
	}

	@Override
	public String toString() {
		return "HoKhau [maHK=" + maHK + ", hoTenChuHo=" + hoTenChuHo + ", diaChi=" + diaChi + ", dienTich=" + dienTich
				+ ", chatLuong=" + chatLuong + ", ngaySuaHoKhau=" + ngaySuaHoKhau + ", ngayTaoHoKhau=" + ngayTaoHoKhau
				+ "]";
	}
	
	
}
