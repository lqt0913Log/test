package com.lqt.data.repository;

import com.lqt.data.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User01Repository extends JpaRepository<User,Integer> {
}
