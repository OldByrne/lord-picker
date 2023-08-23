package com.davidayresbyrne.lordpickerbackend.repo;

import com.davidayresbyrne.lordpickerbackend.model.Faction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FactionRepo extends JpaRepository<Faction, Long>{
    Optional<Faction> findFactionById(Long id);
}
