package com.UGS.demo.entity;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
public class Commented {
	@EmbeddedId
	@GeneratedValue
	CommentedKey cid;
	
	@ManyToOne
	@MapsId("rid")
    @JoinColumn(name = "rid")
	private StudentReq rid;
	
	@ManyToOne
	@MapsId("uid")
    @JoinColumn(name = "uid")
	private FACmember uid;
	
	
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
	private Date Entereddatetime; 
    
	private boolean IsRejected;
	private boolean IsRecomended;
	private boolean IsForwarded;
	private String description;
	
	  
	public CommentedKey getCid() {
		return cid;
	}
	public void setCid(CommentedKey cid) {
		this.cid = cid;
	}
	public StudentReq getRid() {
		return rid;
	}
	public void setRid(StudentReq rid) {
		this.rid = rid;
	}
	public FACmember getUid() {
		return uid;
	}
	public void setUid(FACmember uid) {
		this.uid = uid;
	}
	public Date getEntereddatetime() {
		return Entereddatetime;
	}
	public void setEntereddatetime(Date entereddatetime) {
		Entereddatetime = entereddatetime;
	}
	public boolean isIsRejected() {
		return IsRejected;
	}
	public void setIsRejected(boolean isRejected) {
		IsRejected = isRejected;
	}
	public boolean isIsRecomended() {
		return IsRecomended;
	}
	public void setIsRecomended(boolean isRecomended) {
		IsRecomended = isRecomended;
	}
	public boolean isIsForwarded() {
		return IsForwarded;
	}
	public void setIsForwarded(boolean isForwarded) {
		IsForwarded = isForwarded;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
