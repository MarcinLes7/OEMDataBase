package pl.wszib.oemdatabase.web.mappers;

import pl.wszib.oemdatabase.data.entities.WorkplaceEntity;
import pl.wszib.oemdatabase.web.models.WorkplaceModel;

public class WorkplaceMapper {
    public static WorkplaceEntity toEntity(WorkplaceModel model) {
        WorkplaceEntity entity = new WorkplaceEntity();
        entity.setDepartment(model.getDepartment());
        entity.setPhase(model.getPhase());
        entity.setRoom(model.getRoom());
        entity.setActivity(model.getActivity());
        entity.setPpe(model.getPpe());
        entity.setFirstName(model.getFirstName());
        entity.setLastName(model.getLastName());
        return entity;
    }
}
