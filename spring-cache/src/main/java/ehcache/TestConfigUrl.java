package ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class TestConfigUrl {
	public static void main(String[] args) {
		CacheManager manager = new CacheManager(ClassLoader.getSystemResource("ehcache.xml"));
		Cache cache = manager.getCache("mycache");
		cache.put(new Element("name", "sunpeng"));
		String me = (String) cache.get("name").getObjectValue();
		System.out.println(me);
	}
}
