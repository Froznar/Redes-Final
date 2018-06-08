package com.project.CheerUp.repositories;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.CheerUp.models.User;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long>{
	
	@Query("MATCH(n:User{userName:{name}}) RETURN n LIMIT 25")
	User findByUserName(@Param("name") String userName);
	
	
	@Query("MATCH(n:User) RETURN n")
	List<User> findAll();
	
	@Query("CREATE(n:User{userName:{name}, userPassword:{pass}, email:{email}}) RETURN n")
	User save(@Param("name") String userName, @Param("pass") String userPassword, @Param("email") String email);

	@Query("MATCH(u:User{userName:{userName}}) SET u += {datos:{datos}, status:{status}}")
	void update(@Param("userName") String userName, @Param("datos") String datos, @Param("status") String status);
}
