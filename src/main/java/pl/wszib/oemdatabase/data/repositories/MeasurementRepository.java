package pl.wszib.oemdatabase.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wszib.oemdatabase.data.entities.MeasurementEntity;

public interface MeasurementRepository extends JpaRepository<MeasurementEntity, Long> {
}
