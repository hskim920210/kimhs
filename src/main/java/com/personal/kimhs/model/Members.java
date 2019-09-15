package com.personal.kimhs.model;

import java.util.Date;

public class Members {
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_nick;
	private Date m_birth;
	private String m_email;
	private String m_tel;
	private String m_address;
	private Date m_regdate;
	private int m_type;
	
	public Members() {}

	public Members(String m_id, String m_pw, String m_name, String m_nick, Date m_birth, String m_email, String m_tel,
			String m_address, Date m_regdate, int m_type) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_nick = m_nick;
		this.m_birth = m_birth;
		this.m_email = m_email;
		this.m_tel = m_tel;
		this.m_address = m_address;
		this.m_regdate = m_regdate;
		this.m_type = m_type;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_nick() {
		return m_nick;
	}

	public void setM_nick(String m_nick) {
		this.m_nick = m_nick;
	}

	public Date getM_birth() {
		return m_birth;
	}

	public void setM_birth(Date m_birth) {
		this.m_birth = m_birth;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_tel() {
		return m_tel;
	}

	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	public Date getM_regdate() {
		return m_regdate;
	}

	public void setM_regdate(Date m_regdate) {
		this.m_regdate = m_regdate;
	}

	public int getM_type() {
		return m_type;
	}

	public void setM_type(int m_type) {
		this.m_type = m_type;
	}

}
