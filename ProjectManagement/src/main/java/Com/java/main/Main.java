package Com.java.main;

import java.util.Scanner;


import Com.java.dao.ProjectRepositoryImpl;
import Com.java.dao.ProjectRepositoryImpl.EmployeeNotFoundException;
import Com.java.dao.ProjectRepositoryImpl.ProjectNotFoundException;
import Com.java.model.Employee;
import Com.java.model.Project;
import Com.java.model.Task;
import Com.java.service.*;

public class Main {
public static void main(String[]args) throws ProjectNotFoundException, EmployeeNotFoundException {
	Scanner sc = new Scanner(System.in);
employeeservice es=new employeeservice();
projectservice ps=new projectservice();
taskservice ts=new taskservice();
	
	System.out.println("---Welcome to Project Management System!---");
			    while(true) {
			    System.out.println("Select an option:");
			    System.out.println("1. Create Employee");
			    System.out.println("2. Create Project");
			    System.out.println("3. Create Task");
			    System.out.println("4. Assign project to employee");
			    System.out.println("5. Assign Task in Project to employee");
			    System.out.println("6. delete employee");
			    System.out.println("7. delete project");
			    System.out.println("8. get all tasks");
			    System.out.println("9. exit");
			        
			    System.out.println("Enter ur choice");
			    int ch=sc.nextInt();
			    switch (ch){
			    case 1:
			    	es.createEmployee();
			        break;
			    case 2:
			    	ps.createProject();
			        break;
			    case 3:
			    	ts.createTask();
			    	break;
			    case 4:
			    	es.assignProjectToEmployee();
			    	break;
			    case 5:
			    es.AssigntaskInProjecttoEmployee();
			    	break;
			    case 6:
			    	es.deleteEmployee();
			    	break;
			    case 7:
			    	ps.deleteProject();
			    	break;
			    case 8:  
			    	es.getAllTasks();
			    	break;
			    case 9:
			    	System.out.println("Exiting Project Management System");
			    	System.exit(0);
			    	break;
			    default: 
			    	System.out.println("Invalid choice. Please try again.");
			    	break;
			            }
			        }
			    }
}

