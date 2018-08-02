package web.sample.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.sample.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired 
	EmployeeDao employeeDao;
	
	@Override
	public Integer createEmployee(String name) {
		return employeeDao.insert(name);
	}

	@Override
	public String getEmployee(Integer id) {
		return employeeDao.get(id);
	}
	
	@Override
	public void updateEmployee(Integer id, String name) {
		employeeDao.update(id, name);
	}	
}
