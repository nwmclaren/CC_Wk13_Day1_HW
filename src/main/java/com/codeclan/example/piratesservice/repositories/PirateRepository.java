package com.codeclan.example.piratesservice.repositories;

import com.codeclan.example.piratesservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {




}
