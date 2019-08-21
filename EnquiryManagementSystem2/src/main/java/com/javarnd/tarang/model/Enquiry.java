package com.javarnd.tarang.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.ManyToAny;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
allowGetters = true)
public class Enquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@NotBlank
	private String enquirerName;
	@NotBlank
	private String enquirerEmail;
	private int enquirerContactNumber;
	private String query;
	private String isAvailable;
	@Temporal(TemporalType.DATE)
	@CreatedDate
	private Date createdAt;
	@Temporal(TemporalType.DATE)
	@LastModifiedDate
	private Date updatedAt;
	
	@ManyToOne
	private Course course;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnquirerName() {
		return enquirerName;
	}

	public void setEnquirerName(String enquirerName) {
		this.enquirerName = enquirerName;
	}

	public String getEnquirerEmail() {
		return enquirerEmail;
	}

	public void setEnquirerEmail(String enquirerEmail) {
		this.enquirerEmail = enquirerEmail;
	}

	public int getEnquirerContactNumber() {
		return enquirerContactNumber;
	}

	public void setEnquirerContactNumber(int enquirerContactNumber) {
		this.enquirerContactNumber = enquirerContactNumber;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Enquiry(int id, String enquirerName, String enquirerEmail, int enquirerContactNumber, String query,
			String isAvailable, int courseId) {
		super();
		this.id = id;
		this.enquirerName = enquirerName;
		this.enquirerEmail = enquirerEmail;
		this.enquirerContactNumber = enquirerContactNumber;
		this.query = query;
		this.isAvailable = isAvailable;
		this.course = new Course(courseId,"","");
	}

	public Enquiry() {
		super();
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}	
	
	
	
}
