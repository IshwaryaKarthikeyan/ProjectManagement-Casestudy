package Com.java.service;

import java.util.Scanner;

import Com.java.dao.ProjectRepositoryImpl;
import Com.java.dao.ProjectRepositoryImpl.EmployeeNotFoundException;
import Com.java.dao.ProjectRepositoryImpl.ProjectNotFoundException;
import Com.java.model.Employee;

public class employeeservice {
	
		
		Scanner sc ;
		ProjectRepositoryImpl pri;
		
		public employeeservice() {
			sc= new Scanner(System.in);
			pri=new ProjectRepositoryImpl();
		}
		
		
		public void createEmployee() {
			
			Employee e=new Employee();
			
			System.out.println("Enter ID : ");
			e.setId(sc.nextInt());
			
			System.out.println("Enter name : ");
			sc.nextLine();
			e.setName(sc.nextLine());
			
			System.out.println("Designation : ");
		
			e.setDesignation(sc.nextLine());
			
			System.out.println("Enter Gender : ");
			
			e.setGender(sc.nextLine());
			
			System.out.println("Enter Salary : ");
			e.setSalary(sc.nextDouble());
			
			System.out.println("Enter Project_id : ");
			e.setProject_id(sc.nextInt());
			pri.createEmployee(e);
		}
		
		public void assignProjectToEmployee() throws EmployeeNotFoundException, ProjectNotFoundException {
	        System.out.println("Enter Project ID:");
	        int projectId = sc.nextInt();

	        System.out.println("Enter Employee ID:");
	        int employeeId = sc.nextInt();
	        pri.assignProjectToEmployee(projectId, employeeId);
		}
		
		public void AssigntaskInProjecttoEmployee() {
			 	System.out.println("Enter Task ID : ");
			 	int taskid=sc.nextInt();
			 	
			    System.out.println("Enter Project ID : ");
		        int projectId = sc.nextInt();

		        System.out.println("Enter Employee ID : ");
		        int employeeId = sc.nextInt();
		        pri.AssigntaskInProjecttoEmployee(taskid, projectId, employeeId);
			
		}
		
		public void deleteEmployee() {
			Employee e=new Employee();
			
			 System.out.println("Enter Employee ID to delete : ");
			 int userId=sc.nextInt();
			 pri.deleteEmployee(userId);
	}
		public void getAllTasks() {
			Employee e=new Employee();
			
			System.out.println("Enter Employee ID to show list  : ");
			int empId=sc.nextInt();
			
			System.out.println("Enter Project ID to show list  : ");
			int projectId=sc.nextInt();
			
			pri.getAllTasks(empId, projectId);
			
			
			
			
		}

	}


