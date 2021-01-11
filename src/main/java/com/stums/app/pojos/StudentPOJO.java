package com.stums.app.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//DDL for Students records table in the database.
@Entity(name="studentpojo")
public class StudentPOJO {
	
	// Primary ID which increments 
    // automatically when new entry 
    // is added into the database 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	
	int id;
	String studentName;
	String standard;
	int feesAmount;
	boolean feesPaid;

	
	public StudentPOJO()
	{
		
	}
	
	public StudentPOJO(String studentName,String standard, int feesAmount, boolean feesPaid) {
		super();
		this.studentName = studentName;
		this.standard = standard;
		this.feesAmount = feesAmount;
		this.feesPaid = feesPaid;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getFeesAmount() {
		return feesAmount;
	}

	public void setFeesAmount(int feesAmount) {
		this.feesAmount = feesAmount;
	}

	public boolean isFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(boolean feesPaid) {
		this.feesPaid = feesPaid;
	}
}
