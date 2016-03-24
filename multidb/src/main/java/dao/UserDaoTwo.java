package dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoTwo {
	
	@Resource(name="jdbcTemplateTwo")
	private JdbcTemplate jdbcTemplateTwo;
	
	public int save(String name, int age){
		String sql = "insert into user values(?,?)";
		return jdbcTemplateTwo.update(sql, name, age);
	}
}
