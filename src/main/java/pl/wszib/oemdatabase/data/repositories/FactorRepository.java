package pl.wszib.oemdatabase.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wszib.oemdatabase.data.entities.FactorEntity;
@Repository
public interface FactorRepository extends JpaRepository<FactorEntity, Long> {
}
