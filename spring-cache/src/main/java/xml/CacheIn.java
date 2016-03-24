package xml;

import mycache.Student;

public interface CacheIn {
//	public void init();
	public Student findByName(String name) throws InterruptedException;
}
