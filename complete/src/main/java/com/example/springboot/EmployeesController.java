package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class EmployeesController {

	@GetMapping("/")
	public ModelAndView index () {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index.html");
		return modelAndView;
	}

	private static final String template = "Notes on %s.";

	private final AtomicLong counter = new AtomicLong();

	@CrossOrigin(origins = {"http://localhost:8000", "http://localhost:8080"})
	@GetMapping("/api/employee")
	public Employee employee(@RequestParam(required = false, defaultValue = "World") String name) {
		return new Employee(counter.incrementAndGet(), name, String.format(template, name));
	}

	@CrossOrigin(origins = {"http://localhost:8000", "http://localhost:8080"})
	@GetMapping("/api/employees")
	public ArrayList<Employee> employees() {
		ArrayList<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(counter.incrementAndGet(), "Sally Smith", "Great employee! Strength in coding."));
		employeesList.add(new Employee(counter.incrementAndGet(), "Jack Skellington", "Great at exploring new ideas."));
		employeesList.add(new Employee(counter.incrementAndGet(), "Dale Carnegie", "Strong in sales."));
		employeesList.add(new Employee(counter.incrementAndGet(), "Jamie", "Strong in mechanical areas."));
		return employeesList;
	}

}
