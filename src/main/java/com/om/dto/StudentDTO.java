package com.om.dto;

public class StudentDTO {
	
	private int id;
	private String name;
	private String emailId;
	private Long contactNum;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getContactNum() {
		return contactNum;
	}
	public void setContactNum(Long contactNum) {
		this.contactNum = contactNum;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public StudentDTO(int id, String name, String emailId, Long contactNum, String location) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.contactNum = contactNum;
		this.location = location;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", emailId=" + emailId + ", contactNum=" + contactNum
				+ ", location=" + location + "]";
	}
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
