package com.CardioSurgeryIllustrator.CardioSurgeryIllustrator.domain.user.repository;

import com.CardioSurgeryIllustrator.CardioSurgeryIllustrator.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    UserDetails findByEmail(String email);
    Optional<User> findUserByEmail(String email);
}
