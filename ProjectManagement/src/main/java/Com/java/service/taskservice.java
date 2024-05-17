package Com.java.service;

import java.util.Scanner;

import Com.java.dao.ProjectRepositoryImpl;
import Com.java.model.Task;

public class taskservice {
	Scanner sc ;
	ProjectRepositoryImpl pri;
	
	public taskservice() {
		sc=new Scanner(System.in);
		pri=new ProjectRepositoryImpl();
	}
	public void createTask() {
		Task t = new Task();
		
		
		System.out.println("Enter Task Id : ");
		t.setTask_id(sc.nextInt());
		
		System.out.println("Enter Task name : ");
		sc.nextLine();
		t.setTask_name(sc.nextLine());
		
		System.out.println("Enter Project Id : ");
		t.setProject_id(sc.nextInt());
		
		System.out.println("Enter Employee Id : ");
		t.setEmployee_id(sc.nextInt());
		
		System.out.println(" Enter Status (Assigned, started, completed)");
	    sc.nextLine();
	    t.setStatus(sc.nextLine());
	    
	    pri.createTask(t);
		
	}

}


