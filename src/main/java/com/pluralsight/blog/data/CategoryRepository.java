package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pluralsight.blog.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
