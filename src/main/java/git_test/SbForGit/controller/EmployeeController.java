package git_test.SbForGit.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import git_test.SbForGit.entities.Employee;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {

		return new Employee(107, "vijaya");
	}

}
