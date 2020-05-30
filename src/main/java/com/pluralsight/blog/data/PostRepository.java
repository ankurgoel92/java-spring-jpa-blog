package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pluralsight.blog.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}

