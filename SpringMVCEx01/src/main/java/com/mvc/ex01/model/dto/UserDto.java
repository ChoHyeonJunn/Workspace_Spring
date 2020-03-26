package com.mvc.ex01.model.dto;

import java.util.Date;

public class UserDto {
	private int USERNO;
	private String USERID;
	private String USERPW;
	private Date CREATEDATE;

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(int uSERNO, String uSERID, String uSERPW, Date cREATEDATE) {
		super();
		USERNO = uSERNO;
		USERID = uSERID;
		USERPW = uSERPW;
		CREATEDATE = cREATEDATE;
	}

	public int getUSERNO() {
		return USERNO;
	}

	public void setUSERNO(int uSERNO) {
		USERNO = uSERNO;
	}

	public String getUSERID() {
		return USERID;
	}

	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}

	public String getUSERPW() {
		return USERPW;
	}

	public void setUSERPW(String uSERPW) {
		USERPW = uSERPW;
	}

	public Date getCREATEDATE() {
		return CREATEDATE;
	}

	public void setCREATEDATE(Date cREATEDATE) {
		CREATEDATE = cREATEDATE;
	}

	@Override
	public String toString() {
		return "UserDto [USERNO=" + USERNO + ", USERID=" + USERID + ", USERPW=" + USERPW + ", CREATEDATE=" + CREATEDATE
				+ "]";
	}

}
