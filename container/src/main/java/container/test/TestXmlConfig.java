package container.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestXmlConfig {
	public static void main(String[] args) {
		// XML Auto Configuration(Annotation Scanning)
		testBeanFactory01();
		
		// XML Bean Configuration(빈설정, Explicit Configuration)
		// testBeanFactory02();
		
		// XML Auto Configuration(Annotation Scanning)
		// testApplicationContext01();
		
		// XML Bean Configuration(빈설정, Explicit Configuration)
		// testApplicationContext02();
	}
	private static void testBeanFactory01() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext01.xml"));
		
	}
}
