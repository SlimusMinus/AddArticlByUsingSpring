package com.example.demo.repo;

import com.example.demo.model.UserComments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends CrudRepository<UserComments, Long> {
    List<UserComments> findByArticleId(Long id);
}