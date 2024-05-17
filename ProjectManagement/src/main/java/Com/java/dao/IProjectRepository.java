package Com.java.dao;

import java.util.*;

import Com.java.exception.exceptions.EmployeeNotFoundException;

import Com.java.exception.exceptions.ProjectNotFoundException;

import Com.java.model.Employee;
import Com.java.model.Project;
import Com.java.model.Task;

public interface IProjectRepository {
	
	 boolean createEmployee(Employee emp);
	 boolean createProject(Project pj);
	 boolean createTask(Task task);
	 boolean assignProjectToEmployee(int projectId, int employeeId) throws  EmployeeNotFoundException, ProjectNotFoundException;
	 boolean AssigntaskInProjecttoEmployee( int taskid, int projectid, int employeeId);
	 boolean deleteEmployee(int userId);
	 boolean deleteProject(int projectId) throws ProjectNotFoundException;
	 List<Task> getAllTasks(int empId,int projectId);
	
}
	 
