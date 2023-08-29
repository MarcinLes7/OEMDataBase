package pl.wszib.oemdatabase.web.mappers;

import pl.wszib.oemdatabase.data.entities.MeasurementEntity;
import pl.wszib.oemdatabase.web.models.MeasurementModel;

public class MeasurementMapper {
    public static MeasurementModel toModel(MeasurementEntity entity) {
        return new MeasurementModel(
                entity.getFactorName(),
                entity.getFactorDescription(),
                entity.getOel(),
                entity.getUnit(),
                entity.getMeasurementResult(),
                entity.getDivideResult(),
                entity.getInterpretation(),
                entity.getCtime(),
                entity.getDepartment(),
                entity.getPhase(),
                entity.getRoom(),
                entity.getActivity(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getPpe()
                );
    }
}
