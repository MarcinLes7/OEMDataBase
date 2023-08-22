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
    @Column(name = "oel")
    private double oel;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workplace_id")
    private WorkplaceEntity workplace;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFactorName() {
        return factorName;
    }

    public void setFactorName(String factorName) {
        this.factorName = factorName;
    }

    public double getOel() {
        return oel;
    }

    public void setOel(double oel) {
        this.oel = oel;
    }

    public WorkplaceEntity getWorkplace() {
        return workplace;
    }

    public void setWorkplace(WorkplaceEntity workplace) {
        this.workplace = workplace;
    }

}
