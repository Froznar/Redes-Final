package com.project.CheerUp.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.project.CheerUp.models.Problem;

@Repository
public interface ProblemRepository extends Neo4jRepository<Problem, Long>{

	@Query("MATCH(p:Problem{author:{author}}) RETURN p")
	List<Problem> findByAuthor(@Param("author") String author);
	
}
