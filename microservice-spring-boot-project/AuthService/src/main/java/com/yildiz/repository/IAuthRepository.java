package com.yildiz.repository;

import com.yildiz.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IAuthRepository extends JpaRepository<Auth,Long> {
    boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Optional<Auth> findByUsernameAndPassword(String username, String password);

}
