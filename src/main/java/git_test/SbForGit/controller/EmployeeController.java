package git_test.SbForGit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import git_test.SbForGit.entities.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("/{id}")
	public Employee getSingleEmployee(@PathVariable int id) {
		return new Employee(101,"Raj");
	}
	

}
