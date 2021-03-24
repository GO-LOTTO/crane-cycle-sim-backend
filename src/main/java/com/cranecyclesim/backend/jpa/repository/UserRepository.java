package com.cranecyclesim.backend.jpa.repository;

import com.cranecyclesim.backend.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
