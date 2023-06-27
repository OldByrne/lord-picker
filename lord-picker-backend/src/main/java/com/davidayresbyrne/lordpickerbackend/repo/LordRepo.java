package com.davidayresbyrne.lordpickerbackend.repo;

import com.davidayresbyrne.lordpickerbackend.model.Lord;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface LordRepo extends JpaRepository<Lord, Long> {
    Optional<Lord> findLordById(Long id);

}
