import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mycache.MyCache;
import mycache.Student;
import xml.CacheIn;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-cache.xml");
		CacheIn cache =  (CacheIn) context.getBean("xmlCache");
		System.out.println(cache.getClass().getName());
		Student s = cache.findByName("50");
		cache.findByName("50");
		cache.findByName("50");
		Student s2 = cache.findByName("50");
		System.out.println(s);
		System.out.println(s2);
	}
}
