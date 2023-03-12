package com.geekster.sqldemo.dao;

import com.geekster.sqldemo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Integer> {
}
