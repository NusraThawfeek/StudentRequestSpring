package com.UGS.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class FACmember {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;
	@Column(nullable = false)
	private String uname;
	
	@Column(nullable = false)
	private String email;
	
	private String pw;
	
	@Column(name="department")
	private String dep;
	
	@Column(name="Job_Title")
	private String type;
	
	@OneToMany(mappedBy = "uid",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Commented> comments;
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "FACmember [uid=" + uid + ", uname=" + uname + ", email=" + email + ", pw=" + pw + ", dep=" + dep
				+ ", type=" + type + ", comments=" + comments + "]";
	}
	
	
	
	
	
}
