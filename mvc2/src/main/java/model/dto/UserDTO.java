package model.dto;

import java.sql.Timestamp;

public class UserDTO {
	private String id;
	private String pw;
	private Timestamp regdate;
	
	public UserDTO(String id, String pw, Timestamp regdate) {
		this.id = id;
		this.pw = pw;
		this.regdate = regdate;
	}
	
	public UserDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
}
