package com.Gabriel.project.repository;

import com.Gabriel.project.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Optional<Category> findCategoriesByNameContainingIgnoreCase(String name);
}
