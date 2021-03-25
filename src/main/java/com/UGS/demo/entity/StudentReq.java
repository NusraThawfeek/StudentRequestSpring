package com.UGS.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)

public class StudentReq {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int rid;
	
	private String annexPath;
	
//	  @UpdateTimestamp
//	    @Temporal(TemporalType.TIMESTAMP)
//		private Date Entereddatetime;  
	
	@Temporal(TemporalType.DATE)
	private Date Entereddatetime = new Date();
	
	
	@Column(name="current_status")
	private String decision;
	
	private boolean isSendToFacBoard;
	
	@OneToMany(mappedBy = "rid",cascade = CascadeType.ALL)
	@JsonManagedReference
	
	private List<Commented> comments;
	
	private String type;

	public StudentReq( String annexPath, Date entereddatetime, String decision, boolean isSendToFacBoard,
			 String type) {
	
		super();
		this.annexPath = annexPath;
		this.Entereddatetime = entereddatetime;
		this.decision = decision;
		this.isSendToFacBoard = isSendToFacBoard;
		this.type = type;
	}
	
	public StudentReq() {
		super();
	}
	
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	

	public String getDecision() {
		return decision;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public Date getEntereddatetime() {
		return Entereddatetime;
	}
	public void setEntereddatetime(Date entereddatetime) {
		Entereddatetime = entereddatetime;
	}
	public String getAnnexPath() {
		return annexPath;
	}
	public void setAnnexPath(String annexPath) {
		this.annexPath = annexPath;
	}
	public boolean isSendToFacBoard() {
		return isSendToFacBoard;
	}
	public void setSendToFacBoard(boolean isSendToFacBoard) {
		this.isSendToFacBoard = isSendToFacBoard;
	}
	public List<Commented> getComments() {
		return comments;
	}
	public void setComments(List<Commented> comments) {
		this.comments = comments;
	}
	
	@Override
	public String toString() {
		return "StudentReq [rid=" + rid + ", annexPath=" + annexPath + ", Entereddatetime=" + Entereddatetime
				+ ", decision=" + decision + ", isSendToFacBoard="
				+ isSendToFacBoard + ", comments=" + comments + "]";
	}
	
	
	
	
}
