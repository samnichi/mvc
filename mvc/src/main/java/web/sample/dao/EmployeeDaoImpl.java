package web.sample.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {
	@Override
	public Integer insert(String name) {
		final KeyHolder keyHolder = new GeneratedKeyHolder();
		String sql = " insert into employee (name) value(:name)";
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
        paramMap.addValue("name", name);
		namedParameterJdbcTemplate.update(sql, paramMap,keyHolder);
		return keyHolder.getKey().intValue();
	}

	@Override
	public String get(Integer id) {
		String sql = " select name from employee where id =:id";
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
        paramMap.addValue("id", id);
        try {
        	return namedParameterJdbcTemplate.queryForObject(sql, paramMap, String.class);
		} catch (EmptyResultDataAccessException e) {
			
		}
        return null;
	}
	@Override
	public void update(Integer id, String name) {
		String sql = " update employee set name = :name where id =:id";
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
        paramMap.addValue("id", id);
        paramMap.addValue("name", name);
		namedParameterJdbcTemplate.update(sql, paramMap);
	}

}
