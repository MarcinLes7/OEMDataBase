package pl.wszib.oemdatabase.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wszib.oemdatabase.data.entities.WorkplaceEntity;

public interface WorkplaceRepository extends JpaRepository<WorkplaceEntity, Long> {
}
