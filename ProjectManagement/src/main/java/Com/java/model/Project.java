package Com.java.model;

public class Project {
	private int Id; 
	private String ProjectName ;
	private String Description;
	private String Startdate;
	private String Status;
	
	public Project(){
		
	}
public Project(int Id,String ProjectName,String Description,String Startdate,String Status){
	this.Id=Id;
	this.ProjectName=ProjectName;
	this.Description=Description;
	this.Startdate=Startdate;
	this.Status=Status;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getProjectName() {
	return ProjectName;
}
public void setProjectName(String projectName) {
	ProjectName = projectName;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getStartdate() {
	return Startdate;
}
public void setStartdate(String startdate) {
	Startdate = startdate;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}


}
