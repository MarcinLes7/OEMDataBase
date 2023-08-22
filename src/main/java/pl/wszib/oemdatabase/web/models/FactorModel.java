package pl.wszib.oemdatabase.web.models;

import jakarta.validation.constraints.Pattern;

public class FactorModel {
    private Long id;
    private String name;
    private double oel;
    private String unit;
    private String description;

    public FactorModel() {

    }

    public FactorModel(Long id, String name, double oel, String unit, String description) {
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

    public double getOel() {
        return oel;
    }
    public void setOel(double oel) {
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
