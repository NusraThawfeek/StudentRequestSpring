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

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
public class Commented {
	@EmbeddedId
	@GeneratedValue
	CommentedKey cid;
	
	@ManyToOne
	@MapsId("rid")
    @JoinColumn(name = "rid")
	@JsonBackReference
	private StudentReq rid;
	
	@ManyToOne
	@MapsId("uid")
    @JoinColumn(name = "uid")
	private FACmember uid;
	
	@ManyToOne
    @JoinColumn(name = "EditedBy", nullable = true)
	private FACmember EditedBy;
	
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
	private Date Entereddatetime; 
    
	private boolean IsRejected;
	private boolean IsRecomended;
	private boolean IsForwarded;
	private String description;
	private boolean Editable;
	
	
	

	
	
	public Commented(CommentedKey cid, StudentReq rid, FACmember uid, Date entereddatetime, boolean isRejected,
			boolean isRecomended, boolean isForwarded, String description) {
		super();
		this.cid = new CommentedKey(rid.getRid(),uid.getUid());
		Entereddatetime = entereddatetime;
		IsRejected = isRejected;
		IsRecomended = isRecomended;
		IsForwarded = isForwarded;
		this.description = description;
		
	
	}


	public Commented() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public boolean isEditable() {
		return Editable;
	}

	public void setEditable(boolean editable) {
		Editable = editable;
	}

	public FACmember getEditedBy() {
		return EditedBy;
	}

	public void setEditedBy(FACmember editedBy) {
		EditedBy = editedBy;
	}
	
	
	
}
