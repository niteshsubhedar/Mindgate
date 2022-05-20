import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.aop.ApplicationService;

public class TestSpring {
public static void main(String[] args) {
	
	ApplicationContext beanFactory =new ClassPathXmlApplicationContext("spring.xml");
	
	//Aspect J
	ApplicationService annoservice =(ApplicationService) beanFactory.getBean(ApplicationService.class);
	System.out.println();
	annoservice.processApplication();
}
}
