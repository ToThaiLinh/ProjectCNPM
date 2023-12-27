package model;

public class PhiDichVu {
	private String maPhiDichVu;
	private double veSinh;
	private double baoTri;
	private double sinhHoatChung;
	private double anNinh;
	private String tinhTrang;
	
	public PhiDichVu() {
		
	}

	public PhiDichVu(String maPhiDichVu, double veSinh, double baoTri, double sinhHoatChung, double anNinh,
			String tinhTrang) {
		super();
		this.maPhiDichVu = maPhiDichVu;
		this.veSinh = veSinh;
		this.baoTri = baoTri;
		this.sinhHoatChung = sinhHoatChung;
		this.anNinh = anNinh;
		this.tinhTrang = tinhTrang;
	}

	public String getMaPhiDichVu() {
		return maPhiDichVu;
	}

	public void setMaPhiDichVu(String maPhiDichVu) {
		this.maPhiDichVu = maPhiDichVu;
	}

	public double getVeSinh() {
		return veSinh;
	}

	public void setVeSinh(double veSinh) {
		this.veSinh = veSinh;
	}

	public double getBaoTri() {
		return baoTri;
	}

	public void setBaoTri(double baoTri) {
		this.baoTri = baoTri;
	}

	public double getSinhHoatChung() {
		return sinhHoatChung;
	}

	public void setSinhHoatChung(double sinhHoatChung) {
		this.sinhHoatChung = sinhHoatChung;
	}

	public double getAnNinh() {
		return anNinh;
	}

	public void setAnNinh(double anNinh) {
		this.anNinh = anNinh;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	
}
