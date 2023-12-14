package io.github.shymega.repaircafe.api.db.repositories;

import io.github.shymega.repaircafe.api.entities.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CafeRepository extends JpaRepository<Cafe, UUID> {
    Cafe findCafebyShortId(String cafeShortId); // Unique column.
}
