package test;

import model.HoKhau;
import service.HoKhauService;

import java.sql.Date;
import java.util.ArrayList;

public class test_service {
	public static void main(String[] args) {
		HoKhau hk = new HoKhau("1234", "To Thai Linh1", "So 8 Luong Dinh Cua", 25.5, "Tot", new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()));
		//HoKhauService.getInstance().insert(hk);
		HoKhauService.getInstance().update(hk);
		ArrayList<HoKhau> arr_hk = HoKhauService.getInstance().selectAll();
		for(HoKhau  e : arr_hk) {
			System.out.println(e.toString());
		}
	}
}
