package pl.wszib.oemdatabase.web.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pl.wszib.oemdatabase.data.entities.FactorEntity;
import pl.wszib.oemdatabase.data.entities.WorkplaceEntity;

import java.math.BigDecimal;
import java.sql.Date;

public class MeasurementModel {
    private String factorName;
    private String factorDescription;
    private BigDecimal oel;
    private String unit;
    private BigDecimal measurementResult;
    private BigDecimal divideResult;
    private String interpretation;
    private Date ctime;
    private String department;
    private String phase;
    private String room;
    private String activity;
    private String firstName;
    private String lastName;
    private String ppe;

    public MeasurementModel(String factorName, String factorDescription, BigDecimal oel, String unit, BigDecimal measurementResult, BigDecimal divideResult, String interpretation, Date ctime, String department, String phase, String room, String activity, String firstName, String lastName, String ppe) {
        this.factorName = factorName;
        this.factorDescription = factorDescription;
        this.oel = oel;
        this.unit = unit;
        this.measurementResult = measurementResult;
        this.divideResult = divideResult;
        this.interpretation = interpretation;
        this.ctime = ctime;
        this.department = department;
        this.phase = phase;
        this.room = room;
        this.activity = activity;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ppe = ppe;
    }

    public String getFactorName() {
        return factorName;
    }

    public void setFactorName(String factorName) {
        this.factorName = factorName;
    }

    public String getFactorDescription() {
        return factorDescription;
    }

    public void setFactorDescription(String factorDescription) {
        this.factorDescription = factorDescription;
    }

    public BigDecimal getOel() {
        return oel;
    }

    public void setOel(BigDecimal oel) {
        this.oel = oel;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getMeasurementResult() {
        return measurementResult;
    }

    public void setMeasurementResult(BigDecimal measurementResult) {
        this.measurementResult = measurementResult;
    }

    public BigDecimal getDivideResult() {
        return divideResult;
    }

    public void setDivideResult(BigDecimal divideResult) {
        this.divideResult = divideResult;
    }

    public String getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(String interpretation) {
        this.interpretation = interpretation;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
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
