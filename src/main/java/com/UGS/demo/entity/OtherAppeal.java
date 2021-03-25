package com.UGS.demo.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table
@PrimaryKeyJoinColumn

public class OtherAppeal extends StudentReq {

	private String appealbrief;
	private String appealSummary;
	private String scanCopyOfSGPAPath;
	private String isTrainingCompleted;
	


	public OtherAppeal(String annexPath,String decision, Date entereddatetime, boolean isSendToFacBoard, String type,
			String appealbrief, String appealSummary, String scanCopyOfSGPAPath, String isTrainingCompleted) {
		super(annexPath, entereddatetime, decision, isSendToFacBoard, type);
		this.appealbrief = appealbrief;
		this.appealSummary = appealSummary;
		this.scanCopyOfSGPAPath = scanCopyOfSGPAPath;
		this.isTrainingCompleted = isTrainingCompleted;
	}

	
	
	public OtherAppeal(String annexPath, Date entereddatetime, String decision, boolean isSendToFacBoard, String type) {
		super(annexPath, entereddatetime, decision, isSendToFacBoard, type);
		// TODO Auto-generated constructor stub
	}



	public OtherAppeal() {
		super();
	}

	public String getAppealbrief() {
		return appealbrief;
	}

	public void setAppealbrief(String appealbrief) {
		this.appealbrief = appealbrief;
	}

	public String getAppealSummary() {
		return appealSummary;
	}

	public void setAppealSummary(String appealSummary) {
		this.appealSummary = appealSummary;
	}

	public String getScanCopyOfSGPAPath() {
		return scanCopyOfSGPAPath;
	}

	public void setScanCopyOfSGPAPath(String scanCopyOfSGPAPath) {
		this.scanCopyOfSGPAPath = scanCopyOfSGPAPath;
	}

	public String getIsTrainingCompleted() {
		return isTrainingCompleted;
	}

	public void setIsTrainingCompleted(String isTrainingCompleted) {
		this.isTrainingCompleted = isTrainingCompleted;
	}
	
	
}

