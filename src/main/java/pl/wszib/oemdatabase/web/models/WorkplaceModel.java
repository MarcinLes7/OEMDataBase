package pl.wszib.oemdatabase.web.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

public class WorkplaceModel {
    @Range(min=0, max=1000)
    private BigDecimal measurementResult;
    @Size(min=1, max=50)
    @Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}")
    private String ctime;
    @Size(min=1, max=50)
    private String department;
    @Size(min=1, max=50)
    private String phase;
    @Size(min=1, max=50)
    private String room;
    @Size(min=1, max=500)
    private String activity;
    @Size(min=1, max=50)
    private String firstName;
    @Size(min=1, max=50)
    private String lastName;
    @Size(min=1, max=500)
    private String ppe;

    public BigDecimal getMeasurementResult() {
        return measurementResult;
    }

    public void setMeasurementResult(BigDecimal measurementResult) {
        this.measurementResult = measurementResult;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPpe() {
        return ppe;
    }

    public void setPpe(String ppe) {
        this.ppe = ppe;
    }
}

