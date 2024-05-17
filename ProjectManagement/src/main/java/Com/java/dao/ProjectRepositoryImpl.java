package Com.java.dao;

	import java.sql.*;
	import java.util.List;

import Com.java.exception.exceptions.EmployeeNotFoundException;
import Com.java.exception.exceptions.ProjectNotFoundException;
import Com.java.model.*;
	import Com.java.util.*;

	public class ProjectRepositoryImpl implements IProjectRepository {
		
		
		private static final int ProjectId = 0;
		private static final int EmployeeId = 0;
		private Connection conn;
		PreparedStatement stmt;
		
		public ProjectRepositoryImpl(){
			conn= DBConnection.getConnect();
		}
		public class ProjectNotFoundException extends Exception {
		    public ProjectNotFoundException(String message) {
		        super(message);
		}
		}

		public class EmployeeNotFoundException extends Exception{
		    public EmployeeNotFoundException(String message) {
		        super(message);
		    }
		}



		public boolean createEmployee(Employee emp) {
			try {
				stmt=conn.prepareStatement("insert into Employee values(?,?,?,?,?,?) ");
				stmt.setInt(1,emp.getId());
				stmt.setString(2, emp.getName());
				stmt.setString(3, emp.getDesignation());
				stmt.setString(4, emp.getGender());
				stmt.setDouble(5, emp.getSalary());
				stmt.setInt(6, emp.getProject_id());
				stmt.executeUpdate();
				System.out.println("Records added");
			}
			catch(SQLException e){
				System.out.println(e);
			}
			
			return true;
		}

		public boolean createProject(Project pj) {
			try {
				stmt=conn.prepareStatement("insert into Project values(?,?,?,?,?) ");
				stmt.setInt(1,pj.getId());
				stmt.setString(2, pj.getProjectName());
				stmt.setString(3, pj.getDescription());
				stmt.setString(4, pj.getStartdate());
				stmt.setString(5, pj.getStatus());
				stmt.executeUpdate();
				System.out.println("records added");
			
			}
			catch(SQLException e){
				System.out.println(e);
			}
			return true;
		}

		public boolean createTask(Task task) {
			try {
				stmt=conn.prepareStatement("insert into Task values(?,?,?,?,?) ");
				stmt.setInt(1, task.getTask_id());
				stmt.setString(2, task.getTask_name());
				stmt.setInt(3, task.getProject_id());
				stmt.setInt(4, task.getEmployee_id());
				stmt.setString(5, task.getStatus());
				stmt.executeUpdate();
				System.out.println("Records added");
			
			}
			catch(SQLException e){
				System.out.println(e);
			}
			return true;
		}

		public boolean assignProjectToEmployee(int ProjectId, int EmployeeId) {

		        try{
		        	stmt=conn.prepareStatement("update Employee set Project_id = ? where id = ?");
		            stmt.setInt(1,ProjectId);
		            stmt.setInt(2,EmployeeId);
		            stmt.executeUpdate();
		            System.out.println("Projects assigned");
		        }
		        catch (SQLException e) {
					System.out.println(e);

		        }
			return true;
		}

		public boolean AssigntaskInProjecttoEmployee(int taskid, int Projectid, int EmployeeId) {
			try{
	        	stmt=conn.prepareStatement("update Task set Employee_id = ? where task_id = ? and Project_id = ?");
	            stmt.setInt(1,EmployeeId);
	            stmt.setInt(2,taskid);
	            stmt.setInt(3,Projectid);
	            stmt.executeUpdate();
	            System.out.println(" Assigned task in projects to Employees");
	        }
	        catch (SQLException e) {
				System.out.println(e);

	        }
			
			return true;
		}

		public boolean deleteEmployee(int userId) {
			try{
	        	stmt=conn.prepareStatement("delete t, e from Task t join Employee e on t.employee_id=e.id where e.id =?");
	            stmt.setInt(1,userId);
	            stmt.executeUpdate();
	            System.out.println("Record deleted from Employee");
	            
	        }
	        catch (SQLException e) {
				System.out.println(e);

	        }
			
			return true;
		}
		public boolean deleteProject(int ProjectId) {
			
			try{
	        	stmt=conn.prepareStatement("delete from Project where Id=?");
	            stmt.setInt(1,ProjectId);
	            stmt.executeUpdate();
	            System.out.println("Record deleted from Project");
	            
	        }
	        catch (SQLException e) {
				System.out.println(e);

	        }
			return true;
		}

		public List<Task> getAllTasks(int EmpId, int ProjectId) {
			try{
				
	        	stmt=conn.prepareStatement("select * from Task where Employee_id = ? and Project_id = ?");
	            stmt.setInt(1,EmpId);
	            stmt.setInt(2,ProjectId); 
	            ResultSet rs = stmt.executeQuery();
		        while(rs.next()) {
		        	System.out.println("Task ID : "+rs.getInt(1));
		        	System.out.println("Task Name : "+rs.getString(2));
		        	System.out.println("Project ID : "+rs.getInt(3));
		        	System.out.println("Employee ID : "+rs.getInt(4));
		        	System.out.println("Task Status : "+rs.getString(5));
		        	
		        }
	        }
	        catch (SQLException e) {
				System.out.println(e);

	        }
			
			return null;
		}

	}


