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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class StudentReq {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int rid;
	
	private String description;

	
	  @UpdateTimestamp
	    @Temporal(TemporalType.TIMESTAMP)
		private Date Entereddatetime;  
	
	private boolean IsSentToFacBoard ;
	
	@Column(name="current_status")
	private String decision;
	
	@OneToMany(mappedBy = "rid",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Commented> comments;
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isIsSentToFacBoard() {
		return IsSentToFacBoard;
	}
	public void setIsSentToFacBoard(boolean isSentToFacBoard) {
		IsSentToFacBoard = isSentToFacBoard;
	}
	public String getDecision() {
		return decision;
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
	
	@Override
	public String toString() {
		return "StudentReq [rid=" + rid + ", description=" + description + ", IsSentToFacBoard=" + IsSentToFacBoard
				+ ", decision=" + decision + "]";
	}
	
	
}
