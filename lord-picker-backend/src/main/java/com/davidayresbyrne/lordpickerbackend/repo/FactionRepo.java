package com.davidayresbyrne.lordpickerbackend.repo;

import com.davidayresbyrne.lordpickerbackend.model.Faction;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FactionRepo extends JpaRepository<Faction, Long>{
    Optional<Faction> findFactionById(Long id);
}
