package pl.wszib.oemdatabase.web.mappers;

import pl.wszib.oemdatabase.data.entities.FactorEntity;
import pl.wszib.oemdatabase.web.models.FactorModel;

public class FactorMapper {
    public static FactorModel toModel(FactorEntity entity) {
        return new FactorModel(entity.getId(),
                entity.getName(),
                entity.getNds(),
                entity.getUnit(),
                entity.getDescription()
        );
    }
}
