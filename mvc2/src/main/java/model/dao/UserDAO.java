package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

import model.dto.UserDTO;
import util.DBManager;

public class UserDAO {
	private UserDAO() {}
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	
	private ArrayList<UserDTO> users = null;
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public int addUser(UserDTO user) { // join
		
		try {
			this.conn = DBManager.getConnection();
			
			Calendar cd = Calendar.getInstance();
			Timestamp regdate = new Timestamp(cd.getTimeInMillis());
			UserDTO newUser = new UserDTO(user.getId(), user.getPw(), regdate);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return -1;
	}
	
	
	public boolean checkLogin(String id, String pw) { // login
		return false;
	}
}
