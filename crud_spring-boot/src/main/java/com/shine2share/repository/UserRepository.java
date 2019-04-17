package com.shine2share.repository;
import org.springframework.data.repository.CrudRepository;
import com.shine2share.model.User;
public interface UserRepository extends CrudRepository<User, Long>{
	
}