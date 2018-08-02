package web.sample.dao;

public interface EmployeeDao {
	Integer insert(String name);
	String get(Integer id);
	void update(Integer id, String name);

}
