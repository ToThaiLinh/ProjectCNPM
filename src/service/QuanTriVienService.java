package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.QuanTriVien;

public class QuanTriVienService implements DAOInterface<QuanTriVien> {
	
	public static QuanTriVien getInstance() {
		return new QuanTriVien();
	}

	@Override
	public int insert(QuanTriVien t) {
		//Connection conn = JDBC.
		
		return 0;
	}

	@Override
	public int update(QuanTriVien t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(QuanTriVien t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<QuanTriVien> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuanTriVien selectByID(QuanTriVien t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<QuanTriVien> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
