package pl.wszib.oemdatabase.data.entities;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "measurements", schema="oem")
public class MeasurementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "factor_id")
    private FactorEntity factor;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workplace_id")
    private WorkplaceEntity workplace;

    /*poniżej dodane nowe kolumny do tabeli measurement*/
    @Column(name = "factor_name")
    private String factorName;
    @Column(name = "factor_description")
    private String factorDescription;
    @Column(name = "oel")
    private BigDecimal oel;
    @Column(name = "unit")
    private String unit;
    @Column(name = "measurement_result")
    private BigDecimal measurementResult;
    @Column(name = "divide_result")
    private BigDecimal divideResult;
    @Column(name = "interpretation")
    private String interpretation;
    @Column(name = "ctime")
    private Date ctime;
    @Column(name = "department")
    private String department;
    @Column(name = "phase")
    private String phase;
    @Column(name = "room")
    private String room;
    @Column(name = "activity")
    private String activity;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "ppe")
    private String ppe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FactorEntity getFactor() {
        return factor;
    }

    public void setFactor(FactorEntity factor) {
        this.factor = factor;
    }

    public WorkplaceEntity getWorkplace() {
        return workplace;
    }

    public void setWorkplace(WorkplaceEntity workplace) {
        this.workplace = workplace;
    }


    /*nowe getery i setery*/
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
