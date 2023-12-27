package model;

public class NhanKhau {
	private String maNK;
	private String cccd;
	private String hoTen;
	private String gioiTinh;
	
	public NhanKhau(String maNK, String cccd, String hoTen, String gioiTinh) {
		super();
		this.maNK = maNK;
		this.cccd = cccd;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
	}

	public NhanKhau() {
		
	}

	public String getmaNK() {
		return maNK;
	}

	public void setmaNK(String maNK) {
		this.maNK = maNK;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String gethoTen() {
		return hoTen;
	}

	public void sethoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getgioiTinh() {
		return gioiTinh;
	}

	public void setgioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	
	
	
}
