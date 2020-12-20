package com.rubanlearning.springbootintro.model;

public class EventModel {

	Integer id;
	String name;
	String location;
	String status;

	public EventModel() {}
	
	public EventModel(Integer id, String name, String location, String status) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}