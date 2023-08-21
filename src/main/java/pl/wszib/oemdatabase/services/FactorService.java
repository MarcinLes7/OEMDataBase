package pl.wszib.oemdatabase.services;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.wszib.oemdatabase.data.entities.FactorEntity;
import pl.wszib.oemdatabase.data.repositories.FactorRepository;
import pl.wszib.oemdatabase.web.mappers.FactorMapper;
import pl.wszib.oemdatabase.web.models.FactorModel;

import java.util.List;

@Service
public class FactorService {
    private final FactorRepository factorRepository;

    public FactorService(FactorRepository factorRepository) {
        this.factorRepository = factorRepository;
    }

    public List<FactorModel> findAll() {
        final var entities = factorRepository.findAll();

        return entities.stream()
                .map(FactorMapper::toModel)
                .toList();
    }

    public FactorModel getById(Long factorId) {
        final var entity = factorRepository.findById(factorId).orElseThrow(EntityNotFoundException::new);
        return FactorMapper.toModel(entity);
    }

    @Transactional
    public void deleteById(Long factorId) {
        factorRepository.deleteById(factorId);
    }

    @Transactional
    public void createFactor(FactorModel factorModel) {
        final var entity = FactorMapper.toEntity(factorModel);
        factorRepository.save(entity);
    }

    @Transactional
    public void editFactor(Long factorId, FactorModel factorModel) {
        final var entity = factorRepository.findById(factorId).orElseThrow(EntityNotFoundException::new);

        entity.setName(factorModel.getName());
        entity.setDescription(factorModel.getDescription());
        entity.setNds(factorModel.getNds());
        entity.setUnit(factorModel.getUnit());
    }
}