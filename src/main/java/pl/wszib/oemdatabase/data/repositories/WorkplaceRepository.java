package pl.wszib.oemdatabase.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wszib.oemdatabase.data.entities.WorkplaceEntity;
@Repository
public interface WorkplaceRepository extends JpaRepository<WorkplaceEntity, Long> {
}

/*można tez zastosować: public interface WorkplaceRepository extends CrudRepository<WorkplaceEntity, Long>*/