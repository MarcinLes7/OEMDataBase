package pl.wszib.oemdatabase.data.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "measurements", schema="oem")
public class MeasurementEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "factor_id")
    private FactorEntity factor;
    @Column(name = "multiplicity")
    private BigDecimal multiplicity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "workplace_id")
    private WorkplaceEntity workplace;

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

    public BigDecimal getMultiplicity() {
        return multiplicity;
    }

    public void setMultiplicity(BigDecimal multiplicity) {
        this.multiplicity = multiplicity;
    }

    public WorkplaceEntity getWorkplace() {
        return workplace;
    }

    public void setWorkplace(WorkplaceEntity workplace) {
        this.workplace = workplace;
    }
}
