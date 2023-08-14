package pl.wszib.oemdatabase.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wszib.oemdatabase.data.entities.FactorEntity;

public interface FactorRepository extends JpaRepository<FactorEntity, Long> {
}
