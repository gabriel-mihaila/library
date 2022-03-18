package com.Gabriel.project.repository;

import com.Gabriel.project.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Query("SELECT c FROM Client c WHERE c.email =?1")
    Optional<Client> findByEmail(String email);
}
