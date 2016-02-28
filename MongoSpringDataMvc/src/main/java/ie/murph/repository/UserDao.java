package ie.murph.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ie.murph.domain.User;

@Repository
public interface UserDao extends MongoRepository<User, String>
{
	
}
