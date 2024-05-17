package Com.java.model;

public class Task {
	private int task_id ;
	private String task_name;
	private int Project_id ;
	private int Employee_id ;
	private String Status ;
	
	public Task(){
		
	}
	
	Task(int task_id,String task_name,int Project_id ,int Employee_id ,String Status ){
		this.task_id= task_id;
		this.task_name= task_name;
		this.Project_id=Project_id ;
		this.Employee_id=Employee_id ;
		this.Status=Status;
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public int getProject_id() {
		return Project_id;
	}

	public void setProject_id(int project_id) {
		Project_id = project_id;
	}

	public int getEmployee_id() {
		return Employee_id;
	}

	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	
}
