package pl.wszib.oemdatabase.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.wszib.oemdatabase.data.entities.MeasurementEntity;

import java.util.Collection;

@Repository
public interface MeasurementRepository extends JpaRepository<MeasurementEntity, Long> {
}
