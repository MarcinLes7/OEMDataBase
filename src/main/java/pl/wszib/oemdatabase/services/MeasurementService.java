package pl.wszib.oemdatabase.services;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.wszib.oemdatabase.data.entities.FactorEntity;
import pl.wszib.oemdatabase.data.entities.MeasurementEntity;
import pl.wszib.oemdatabase.data.entities.WorkplaceEntity;
import pl.wszib.oemdatabase.data.repositories.FactorRepository;
import pl.wszib.oemdatabase.data.repositories.MeasurementRepository;
import pl.wszib.oemdatabase.web.mappers.WorkplaceMapper;
import pl.wszib.oemdatabase.web.models.WorkplaceMeasurementModel;

@Service
public class MeasurementService {
    private final MeasurementRepository measurementRepository;
    private final FactorRepository factorRepository;

    public MeasurementService(MeasurementRepository measurementRepository, FactorRepository factorRepository) {
        this.measurementRepository = measurementRepository;
        this.factorRepository = factorRepository;
    }

    @Transactional
    public Long saveMeasurement(Long factorId, WorkplaceMeasurementModel workplaceMeasurementModel) {
        FactorEntity factorEntity = factorRepository.findById(factorId)
                .orElseThrow(EntityNotFoundException::new);

        WorkplaceEntity workplaceEntity = WorkplaceMapper.toEntity(workplaceMeasurementModel);

        MeasurementEntity measurementEntity = new MeasurementEntity();
        measurementEntity.setFactorName(factorEntity.getName());
        measurementEntity.setNds(factorEntity.getNds());
        measurementEntity.setMeasurementResult(measurementEntity.getMeasurementResult());
        measurementEntity.setDate(measurementEntity.getDate());
        measurementEntity.setWorkplaceMeasurement(workplaceEntity);

        final var savedMeasurement = measurementRepository.save(measurementEntity);
        return savedMeasurement.getId();
    }
}
