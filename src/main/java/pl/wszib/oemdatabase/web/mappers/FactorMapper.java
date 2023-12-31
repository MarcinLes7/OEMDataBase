package pl.wszib.oemdatabase.web.mappers;

import pl.wszib.oemdatabase.data.entities.FactorEntity;
import pl.wszib.oemdatabase.web.models.FactorModel;

public class FactorMapper {
    public static FactorModel toModel(FactorEntity entity) {
        return new FactorModel(entity.getId(),
                entity.getName(),
                entity.getOel(),
                entity.getUnit(),
                entity.getDescription()
        );
    }

    public static FactorEntity toEntity(FactorModel model) {
        final var entity = new FactorEntity();

        entity.setName(model.getName());
        entity.setOel(model.getOel());
        entity.setUnit(model.getUnit());
        entity.setDescription(model.getDescription());

        return entity;
    }
}

