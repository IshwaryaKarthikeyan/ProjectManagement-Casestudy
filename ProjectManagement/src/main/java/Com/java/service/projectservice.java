package Com.java.service;

import java.util.Scanner;

import Com.java.dao.ProjectRepositoryImpl;
import Com.java.model.Employee;
import Com.java.model.Project;

public class projectservice {
	Scanner sc ;
	ProjectRepositoryImpl pri;
	
	public projectservice() {
		sc=new Scanner(System.in);
		pri=new ProjectRepositoryImpl();	
	}
	
	public void createProject() {
		
		Project p=new Project();
		
		System.out.println("Enter project Id : ");
		p.setId(sc.nextInt());
		
		System.out.println("Enter Project Name : ");
		sc.nextLine();
		p.setProjectName(sc.nextLine());
		
		System.out.println("Enter Description : ");
	
		p.setDescription(sc.nextLine());
	
		System.out.println("Enter Starting date : ");
		
		p.setStartdate(sc.nextLine());
		
		System.out.println("Enter Status(started/dev/build/test/deployed) : ");
		
		p.setStatus(sc.nextLine());
		
		pri.createProject(p);
		
	}
	
	public void deleteProject() {
		Employee e=new Employee();
      int userId;
		 System.out.println("Enter Project ID to delete : ");
		 userId=sc.nextInt();
		 pri.deleteProject(userId);	
	}
	}


