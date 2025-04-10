package com.example.socialmedia.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.socialmedia.model.User;
import java.util.*;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    Optional<User> findByEmail(String email);
    
}
