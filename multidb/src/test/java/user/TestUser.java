package user;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;

public class TestUser {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-multidb.xml");
		UserService service = context.getBean(UserService.class);
		int result = service.hi("sunpeng", 5);
		System.out.println(result);
	}

}
