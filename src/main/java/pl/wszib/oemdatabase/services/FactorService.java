package pl.wszib.oemdatabase.services;

import jakarta.persistence.EntityNotFoundException;
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
        List<FactorEntity> entities = factorRepository.findAll();
        return entities.stream()
                .map(FactorMapper::toModel)
                .toList();
    }

    public FactorModel getById(Long factorId) {
        FactorEntity factorEntity = factorRepository.findById(factorId).orElseThrow(EntityNotFoundException::new);
        return FactorMapper.toModel(factorEntity);
    }


}
