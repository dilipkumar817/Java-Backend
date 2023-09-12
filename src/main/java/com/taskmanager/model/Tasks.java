package com.taskmanager.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tasks {
	
	@Id
	@GeneratedValue
	int id;
	String trainingName;
	String trainingStartDate;
	String trainingEndDate;
	String completionStatus;
	
	public Tasks() {
		
	}
	
	public Tasks(int id, String trainingName, String trainingStartDate, String trainingEndDate,
			String completionStatus) {
		super();
		this.id = id;
		this.trainingName = trainingName;
		this.trainingStartDate = trainingStartDate;
		this.trainingEndDate = trainingEndDate;
		this.completionStatus = completionStatus;
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTrainingName() {
		return trainingName;
	}


	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}


	public String getTrainingStartDate() {
		return trainingStartDate;
	}


	public void setTrainingStartDate(String trainingStartDate) {
		this.trainingStartDate = trainingStartDate;
	}


	public String getTrainingEndDate() {
		return trainingEndDate;
	}


	public void setTrainingEndDate(String trainingEndDate) {
		this.trainingEndDate = trainingEndDate;
	}


	public String getCompletionStatus() {
		return completionStatus;
	}


	public void setCompletionStatus(String completionStatus) {
		this.completionStatus = completionStatus;
	}
	


//	public int getId() {
//		return id;
//	}
//
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public String getTaskName() {
//		return taskName;
//	}
//
//
//	public void setTaskName(String taskName) {
//		this.taskName = taskName;
//	}
//
//
//	public String getInitiatedDate() {
//		return initiatedDate;
//	}
//
//
//	public void setInitiatedDate(String initiatedDate) {
//		this.initiatedDate = initiatedDate;
//	}
//
//
//	public String getEndDate() {
//		return endDate;
//	}
//
//
//	public void setEndDate(String endDate) {
//		this.endDate = endDate;
//	}
//
//
//	public String getStatus() {
//		return status;
//	}
//
//
//	public void setStatus(String status) {
//		this.status = status;
//	}



}

