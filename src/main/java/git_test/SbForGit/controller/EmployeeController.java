package git_test.SbForGit.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import git_test.SbForGit.entities.Employee;


@RestController
@RequestMapping("/employee/")
public class EmployeeController {
	
	public List<Employee> getAllEmployees(){
		
		return List.of(new Employee(104,"Jay"),new Employee(105,"Jaya"));
	}
	

}
