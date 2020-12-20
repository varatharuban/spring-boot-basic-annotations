package com.rubanlearning.springbootintro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rubanlearning.springbootintro.model.EventModel;
import com.rubanlearning.springbootintro.service.EventService;

@RestController
public class WelcomeController {

	@GetMapping("/active-events")
	public List<EventModel> getActiveEvents() {
		return EventService.getActiveEvents();
	}

	@GetMapping("/active-events/{id}")
	public EventModel getEventById(@PathVariable("id") Integer id) {
		return EventService.getEventById(id);
	}
	
	@PostMapping("/add-event")
	public List<EventModel> addActiveEvents(@RequestBody EventModel eventModel) {
		return EventService.addEventModel(eventModel);
	}

	@DeleteMapping("/delete-event/{id}")
	public List<EventModel> deleteEventById(@PathVariable("id") Integer id) {
		return EventService.deleteEventById(id);
	}
	
}