package pl.wszib.oemdatabase.data.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "measurements")
public class MeasurementEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "factor_name")
    private String factorName;
    @Column(name = "ole")
    private double oel;
    @Column(name = "measurement_result")
    private double measurementResult;
    @Column(name = "date")
    private String date;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workplace_id")
    private WorkplaceEntity workplaceMeasurement;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFactorName() {
        return factorName;
    }
    public void setFactorName(String factor_name) {
        this.factorName = factor_name;
    }
    public double getOel() {
        return oel;
    }
    public void setOel(double oel) {
        this.oel = oel;
    }
    public double getMeasurementResult() {
        return measurementResult;
    }
    public void setMeasurementResult(double measurement_result) {
        this.measurementResult = measurement_result;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public WorkplaceEntity getWorkplaceMeasurement() {
        return workplaceMeasurement;
    }
    public void setWorkplaceMeasurement(WorkplaceEntity workplaceMeasurement) {
        this.workplaceMeasurement = workplaceMeasurement;
    }
}
