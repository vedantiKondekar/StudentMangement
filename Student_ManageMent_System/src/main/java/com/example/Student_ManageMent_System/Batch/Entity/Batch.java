package com.example.Student_ManageMent_System.Batch.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Batch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long BatchId;
	String Batch_name;
	String Start_date;
	String end_Date;
	long StudentId;
	String Batch_catagory;


public long getBatchId() {
return BatchId;
}
public void setBatchId(long batchId) {
BatchId = batchId;
}
public String getBatch_name() {
return Batch_name;
}
public void setBatch_name(String batch_name) {
Batch_name = batch_name;
}
public String getStart_date() {
return Start_date;
}
public void setStart_date(String start_date) {
Start_date = start_date;
}
public String getEnd_Date() {
return end_Date;
}
public void setEnd_Date(String end_Date) {
this.end_Date = end_Date;
}
public long getStudentId() {
return StudentId;
}
public void setStudentId(long studentId) {
StudentId = studentId;
}
public String getBatch_catagory() {
return Batch_catagory;
}
public void setBatch_catagory(String batch_catagory) {
Batch_catagory = batch_catagory;
}
	
}
