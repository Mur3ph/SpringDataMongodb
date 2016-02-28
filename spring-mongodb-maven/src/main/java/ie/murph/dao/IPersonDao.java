package ie.murph.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ie.murph.domain.Person;

public interface IPersonDao extends CrudRepository<Person, Long>{

	 @Query("{'name' : ?0}")
	 public Iterable<Person> searchByName(String personName);
	
}
