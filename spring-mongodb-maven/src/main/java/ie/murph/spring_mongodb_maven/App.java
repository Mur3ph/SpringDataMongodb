package ie.murph.spring_mongodb_maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import ie.murph.domain.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
 
	        MongoOperations ops = context.getBean("mongoTemplate", MongoOperations.class);
	
	        //Create Person..
	        Person person = new Person();
	        person.setPersonId(1l);
	        person.setName("Achilles");
	        
	        Person personHektor = new Person();
	        personHektor.setPersonId(2l);
	        personHektor.setName("Hektor");
	        
	        //Insert..
	        ops.insert(person);
	        
	        //The Spring Data MongoDB Project on Youtube 13 minutes
    }
}
