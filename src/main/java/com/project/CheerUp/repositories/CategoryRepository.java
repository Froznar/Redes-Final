package com.project.CheerUp.repositories;

import java.util.List;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.project.CheerUp.models.Category;

@Repository
public interface CategoryRepository extends Neo4jRepository<Category,Long>{
	@Query("MATCH(c:Category) RETURN c")
	List<Category> findAll();
}
