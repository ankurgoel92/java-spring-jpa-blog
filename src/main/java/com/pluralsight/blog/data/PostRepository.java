package com.pluralsight.blog.data;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pluralsight.blog.model.Category;
import com.pluralsight.blog.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
  List<Post> findByCategory(Category category);
}

