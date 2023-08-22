package pl.wszib.oemdatabase.web.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;

public class FactorModel {
    private Long id;
    @Size(min=1, max=50)
    private String name;
    @Range(min=0, max=1000)
    private BigDecimal oel;
    @Size(min=1, max=50)
    private String unit;
    @Size(min=1, max=500)
    private String description;

    public FactorModel() {

    }

    public FactorModel(Long id, String name, BigDecimal oel, String unit, String description) {
        this.id = id;
        this.name = name;
        this.oel = oel;
        this.unit = unit;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
