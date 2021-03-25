package com.UGS.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CommentedKey implements Serializable {


	@Column(name = "rid")
    private int rid; 

    @Column(name = "uid")
  private int uid;
    
    
    

	public CommentedKey(int rid, int uid) {
		this.rid=rid;
		this.uid=uid;
	}

	
	public CommentedKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rid;
		result = prime * result + uid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommentedKey other = (CommentedKey) obj;
		if (rid != other.rid)
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}

	
	

}