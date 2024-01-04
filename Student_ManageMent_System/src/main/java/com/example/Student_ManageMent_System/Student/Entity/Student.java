package com.example.Student_ManageMent_System.Student.Entity;

import java.util.List;

import com.example.Student_ManageMent_System.Fee.Entity.Fee;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="studentid")
	long studentid;
	String f_name;
	String L_name;
	String Current_address;
	String Email;
	String Parmanate_address;
	long parent_contact;
	long student_contact;
	String education;
	String college_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_Fee_id",referencedColumnName = "studentid")
	private List<Fee> fee;
	
	
	public long getstudentid() {
		return studentid;
	}
	public void setstudentid(long studentid) {
	   this.studentid = studentid;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return L_name;
	}
	public void setL_name(String l_name) {
		L_name = l_name;
	}
	public String getCurrent_address() {
		return Current_address;
	}
	public void setCurrent_address(String current_address) {
		Current_address = current_address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getParmanate_address() {
		return Parmanate_address;
	}
	public void setParmanate_address(String parmanate_address) {
		Parmanate_address = parmanate_address;
	}
	public long getParent_contact() {
		return parent_contact;
	}
	public void setParent_contact(long parent_contact) {
		this.parent_contact = parent_contact;
	}
	public long getStudent_contact() {
		return student_contact;
	}
	public void setStudent_contact(long student_contact) {
		this.student_contact = student_contact;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	
	
	
	
	
	
}
