package model;

public class QuanLy {
	private String maQTV;
	private String maHK;
	
	public QuanLy() {
		super();
	}

	public QuanLy(String maQTV, String maHK) {
		super();
		this.maQTV = maQTV;
		this.maHK = maHK;
	}

	public String getMaQTV() {
		return maQTV;
	}

	public void setMaQTV(String maQTV) {
		this.maQTV = maQTV;
	}

	public String getMaHK() {
		return maHK;
	}

	public void setMaHK(String maHK) {
		this.maHK = maHK;
	}
	
	
}
