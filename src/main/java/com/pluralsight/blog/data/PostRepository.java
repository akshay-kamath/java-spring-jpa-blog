package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Category;
import com.pluralsight.blog.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public interface PostRepository extends JpaRepository<Post, Long> {

		public List<Post> findAll();
		public Optional<Post> findById(Long id);
		public List<Post> findByCategory(Category category);
//    public List<Post> findAll() {
//        return ALL_POSTS;
//    }
//
//    public Optional<Post> findById(Long id) {
//        for(Post post : ALL_POSTS) {
//            if (post.getId() == id)
//                return Optional.of(post);
//        }
//        return Optional.empty();
//    }
}
