package cdu.lhj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringTest {
    @Test
    public void testSpring() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring.xml");
        SpringTest springTest = (SpringTest) context.getBean("springTest");
        springTest.hello();
    }
    public void hello() {
        System.out.println("Hello Spring!");
    }
}
