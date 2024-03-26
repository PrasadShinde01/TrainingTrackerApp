package com.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student11")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    @Column(name="Student_Name")
    private String StudentName;
    
    @Column(name="Contact_Details")
    private String ContactDetails;
    
    @Column(name="Grading_Score")
    private String GradingScore;
    
    public long getId() {
    	return id;
    }
    public void setId(long id) {
    	this.id=id;
    }
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getContactDetails() {
		return ContactDetails;
	}
	public void setContactDetails(String contactDetails) {
		ContactDetails = contactDetails;
	}
	public String getGradingScore() {
		return GradingScore;
	}
	public void setGradingScore(String gradingScore) {
		GradingScore = gradingScore;
	}
   
    
}
