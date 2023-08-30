package pl.wszib.oemdatabase.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.wszib.oemdatabase.data.entities.MeasurementEntity;

import java.util.Collection;

@Repository
public interface MeasurementRepository extends JpaRepository<MeasurementEntity, Long> {
 /*   @Query("select oem.measurements.measurement_result / oem.measurements.oel as divide_result, CASE  WHEN measurement_result / oel < 1 THEN 'zgodny' WHEN measurement_result / oel >= 1 THEN 'niezgodny' END as interpretation from oem.measurements")
    Collection<measurements> divideResult;*/
}
