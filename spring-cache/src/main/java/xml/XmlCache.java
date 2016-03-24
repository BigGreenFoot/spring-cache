package xml;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

import mycache.Student;

@Component("xmlCache")
public class XmlCache implements CacheIn{
	private Map<String, Student> map = new HashMap<String, Student>();
	
	@PostConstruct
	public void init(){
		for (int i = 0; i < 100; i++) {
			
			map.put(i + "", new Student(RandomStringUtils.randomAlphabetic(10), i + ""));
		}
	}
	
	public Student findByName(String name) throws InterruptedException{
		System.out.println("查询数据库...");
		TimeUnit.SECONDS.sleep(2);
		return map.get(name);
	}
}
