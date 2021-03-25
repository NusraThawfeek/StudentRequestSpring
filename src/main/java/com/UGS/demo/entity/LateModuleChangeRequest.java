package com.UGS.demo.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table
@PrimaryKeyJoinColumn

public class LateModuleChangeRequest extends StudentReq {

	private String reason;
	private String scanCopyOfSgpaPath;
	private String isTrainingCompleted;
	
	@OneToMany(mappedBy = "lateModuleChangeRequest")
    private List<LateChanges> lateChanges;

	

	public LateModuleChangeRequest(String annexPath, Date entereddatetime, String decision, boolean isSendToFacBoard,
			 String reason, String scanCopyOfSgpaPath, String isTrainingCompleted,String type
			) {
		super(annexPath, entereddatetime, decision, isSendToFacBoard, type);
		this.reason = reason;
		this.scanCopyOfSgpaPath = scanCopyOfSgpaPath;
		this.isTrainingCompleted = isTrainingCompleted;

	}

	

	public LateModuleChangeRequest(String annexPath, Date entereddatetime, String decision, boolean isSendToFacBoard,
			String type) {
		super(annexPath, entereddatetime, decision, isSendToFacBoard, type);
		
	}



	public LateModuleChangeRequest() {
		super();
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getScanCopyOfSgpaPath() {
		return scanCopyOfSgpaPath;
	}

	public void setScanCopyOfSgpaPath(String scanCopyOfSgpaPath) {
		this.scanCopyOfSgpaPath = scanCopyOfSgpaPath;
	}

	public String getIsTrainingCompleted() {
		return isTrainingCompleted;
	}

	public void setIsTrainingCompleted(String isTrainingCompleted) {
		this.isTrainingCompleted = isTrainingCompleted;
	}

	public List<LateChanges> getLateChanges() {
		return lateChanges;
	}

	public void setLateChanges(List<LateChanges> lateChanges) {
		this.lateChanges = lateChanges;
	}
	
}
