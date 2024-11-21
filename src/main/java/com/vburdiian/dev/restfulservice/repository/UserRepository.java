package com.vburdiian.dev.restfulservice.repository;

import com.vburdiian.dev.restfulservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
