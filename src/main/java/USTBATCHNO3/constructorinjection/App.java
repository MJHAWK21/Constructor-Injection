package USTBATCHNO3.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.lang.String;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    	Role r =context.getBean("setinject", Role.class);
    	
    	r.display();
    	
    }
}