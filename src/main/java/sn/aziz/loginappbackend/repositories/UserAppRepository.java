package sn.aziz.loginappbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.aziz.loginappbackend.entities.UserApp;

import java.util.Optional;

public interface UserAppRepository extends JpaRepository<UserApp, Long> {
    UserApp findByUsername(String username);

    Optional<UserApp> findByEmail(String email);
}
