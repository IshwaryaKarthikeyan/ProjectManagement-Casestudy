import static org.junit.jupiter.api.Assertions.*;

import Com.java.dao.ProjectRepositoryImpl;
import Com.java.model.Employee;
import Com.java.model.Task;
import org.junit.jupiter.api.Test;

class Project {

	@Test
	void test() {
		Com.java.dao.ProjectRepositoryImpl pri =new Com.java.dao.ProjectRepositoryImpl();
		Com.java.model.Employee e=new Com.java.model.Employee();
		e.setId(48);
		e.setName("Testing");
		e.setDesignation(" Testing");
		e.setGender("Male");
		e.setSalary(30000.0);
		e.setProject_id(1);
		
		boolean result=pri.createEmployee(e);
		assertTrue(result, "Successful");
	}
	@Test
	void testCreateTask() {
		Com.java.dao.ProjectRepositoryImpl pri=new Com.java.dao.ProjectRepositoryImpl();
        Com.java.model.Task t = new Com.java.model.Task();
        t.setTask_id(28);
        t.setTask_name("Testing");
        t.setProject_id(1);
        t.setEmployee_id(1);
        t.setStatus("started");

        boolean result =pri.createTask(t);
        assertTrue(result, "Task created");
    }

}

	