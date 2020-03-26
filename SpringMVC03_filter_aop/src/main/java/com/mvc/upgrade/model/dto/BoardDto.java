package com.mvc.upgrade.model.dto;

import java.util.Date;

public class BoardDto {
	private int MYNO;

	private String MYNAME;
	private String MYTITLE;
	private String MYCONTENT;

	private Date MYDATE;

	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardDto(int mYNO, String mYNAME, String mYTITLE, String mYCONTENT, Date mYDATE) {
		super();
		MYNO = mYNO;
		MYNAME = mYNAME;
		MYTITLE = mYTITLE;
		MYCONTENT = mYCONTENT;
		MYDATE = mYDATE;
	}

	public int getMYNO() {
		return MYNO;
	}

	public void setMYNO(int mYNO) {
		MYNO = mYNO;
	}

	public String getMYNAME() {
		return MYNAME;
	}

	public void setMYNAME(String mYNAME) {
		MYNAME = mYNAME;
	}

	public String getMYTITLE() {
		return MYTITLE;
	}

	public void setMYTITLE(String mYTITLE) {
		MYTITLE = mYTITLE;
	}

	public String getMYCONTENT() {
		return MYCONTENT;
	}

	public void setMYCONTENT(String mYCONTENT) {
		MYCONTENT = mYCONTENT;
	}

	public Date getMYDATE() {
		return MYDATE;
	}

	public void setMYDATE(Date mYDATE) {
		MYDATE = mYDATE;
	}

	@Override
	public String toString() {
		return "MyboardDto [MYNO=" + MYNO + ", MYNAME=" + MYNAME + ", MYTITLE=" + MYTITLE + ", MYCONTENT=" + MYCONTENT
				+ ", MYDATE=" + MYDATE + "]";
	}

}
