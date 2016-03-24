package dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoOne {
	
	@Resource(name="jdbcTemplateOne")
	private JdbcTemplate jdbcTemplateOne;
	
	public int save(String name, int age){
		String sql = "insert into user values(?,?)";
		return jdbcTemplateOne.update(sql, name, age);
	}
}
