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

public class AlternativeModuleRequest extends StudentReq {

	private String comment;
	
	@OneToMany(mappedBy = "alterModuleRequest")
    private List<ModuleDiscontinue> moduleDiscontinue;

	

	public AlternativeModuleRequest(String annexPath, Date entereddatetime, String decision, boolean isSendToFacBoard,
			String type, String comment) {
		super(annexPath, entereddatetime, decision, isSendToFacBoard, type);
		this.comment = comment;
	}

	
	
	public AlternativeModuleRequest(String annexPath, Date entereddatetime, String decision, boolean isSendToFacBoard,
			String type) {
		super(annexPath, entereddatetime, decision, isSendToFacBoard, type);
		
	}



	public AlternativeModuleRequest() {
		super();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<ModuleDiscontinue> getModuleDiscontinue() {
		return moduleDiscontinue;
	}

	public void setModuleDiscontinue(List<ModuleDiscontinue> moduleDiscontinue) {
		this.moduleDiscontinue = moduleDiscontinue;
	}
	
}

