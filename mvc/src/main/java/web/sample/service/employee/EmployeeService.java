package web.sample.service.employee;

public interface EmployeeService {

	String getEmployee(Integer id);

	Integer createEmployee(String name);

	void updateEmployee(Integer id, String name);

}
