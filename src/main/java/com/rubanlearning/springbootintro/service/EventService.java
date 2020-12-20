package com.rubanlearning.springbootintro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.rubanlearning.springbootintro.model.EventModel;

public class EventService {

	static List<EventModel> list = new ArrayList<>();

	static {
		list.add(new EventModel(1, "IT Show 2020", "Changi Business Park", "Active"));
		list.add(new EventModel(2, "NKF Run Inspired", "Senthosa", "Completed"));
		list.add(new EventModel(3, "Christmas at Design Orchard", "Orchard", "Active"));
		list.add(new EventModel(4, "My Community Festival", "Little India", "Active"));
		list.add(new EventModel(5, "Santa Run for Wishes 2020", "East Coast Park", "Active"));
		list.add(new EventModel(6, "Back To Live", "Singapore Sports Hub", "Completed"));
	}
	
	public static List<EventModel> getEventModels() {
		return list;
	}

	public static List<EventModel> getActiveEvents() {
		return list.stream().filter(eventModel -> eventModel.getStatus().equalsIgnoreCase("Active"))
				.collect(Collectors.toList());
	}

	public static List<EventModel> getCompletedEvents() {
		return list.stream().filter(eventModel -> eventModel.getStatus().equalsIgnoreCase("Completed"))
				.collect(Collectors.toList());
	}

	public static EventModel getEventById(Integer id) {
		return list.stream().filter(eventModel -> eventModel.getId() == id).findFirst().get();
	}

	public static List<EventModel> addEventModel(EventModel eventModel) {
		list.add(eventModel);
		return list;
	}

	public static List<EventModel> deleteEventById(Integer id) {
		list.remove(list.stream().filter(eventModel -> eventModel.getId() == id).findFirst().get());
		return list;
	}
}