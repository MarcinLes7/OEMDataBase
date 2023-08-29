package pl.wszib.oemdatabase.services;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.wszib.oemdatabase.data.entities.FactorEntity;
import pl.wszib.oemdatabase.data.entities.MeasurementEntity;
import pl.wszib.oemdatabase.data.entities.WorkplaceEntity;
import pl.wszib.oemdatabase.data.repositories.FactorRepository;
import pl.wszib.oemdatabase.data.repositories.MeasurementRepository;
import pl.wszib.oemdatabase.web.mappers.MeasurementMapper;
import pl.wszib.oemdatabase.web.mappers.WorkplaceMapper;
import pl.wszib.oemdatabase.web.models.MeasurementModel;
import pl.wszib.oemdatabase.web.models.WorkplaceModel;

import java.util.List;

@Service
public class MeasurementService {
    private final MeasurementRepository measurementRepository;
    private final FactorRepository factorRepository;

    public MeasurementService(MeasurementRepository measurementRepository, FactorRepository factorRepository) {
        this.measurementRepository = measurementRepository;
        this.factorRepository = factorRepository;
    }

    @Transactional
    public Long saveMeasurement(Long factorId, WorkplaceModel workplaceModel) {
        FactorEntity factorEntity = factorRepository.findById(factorId)
                .orElseThrow(EntityNotFoundException::new);

        WorkplaceEntity workplaceEntity = WorkplaceMapper.toEntity(workplaceModel);

        MeasurementEntity measurementEntity = new MeasurementEntity();

        measurementEntity.setFactor(factorEntity);
        measurementEntity.setWorkplace(workplaceEntity);
        measurementEntity.setFactorName(factorEntity.getName());
        measurementEntity.setFactorDescription(factorEntity.getDescription());
        measurementEntity.setOel(factorEntity.getOel());
        measurementEntity.setUnit(factorEntity.getUnit());
        measurementEntity.setMeasurementResult(workplaceEntity.getMeasurementResult());
        /* teraz powinny być wzięte z sql:
         divide_result
         interpretation */
        measurementEntity.setCtime(workplaceEntity.getCtime());
        measurementEntity.setDepartment(workplaceEntity.getDepartment());
        measurementEntity.setPhase(workplaceEntity.getPhase());
        measurementEntity.setRoom(workplaceEntity.getRoom());
        measurementEntity.setActivity(workplaceEntity.getActivity());
        measurementEntity.setFirstName(workplaceEntity.getFirstName());
        measurementEntity.setLastName(workplaceEntity.getLastName());
        measurementEntity.setPpe(workplaceEntity.getPpe());

        final var savedMeasurement = measurementRepository.save(measurementEntity);
        return savedMeasurement.getId();
    }

    public List<MeasurementModel> findAll() {
        final var entities = measurementRepository.findAll();

        return entities.stream()
                .map(MeasurementMapper::toModel)
                .toList();
    }


}
