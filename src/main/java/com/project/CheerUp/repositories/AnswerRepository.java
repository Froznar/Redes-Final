package com.project.CheerUp.repositories;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.CheerUp.models.Answer;

@Repository
public interface AnswerRepository extends Neo4jRepository<Answer,Long>{
	@Query("MATCH( (a:Answer)-[:TO]->(p:Problem{author:{author}, timestamp:{timestamp}})) RETURN a")
	List<Answer> findAnswersToProblem(@Param("author") String author, @Param("timestamp") Long timestamp);
}
