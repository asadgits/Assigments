package com.nisum.ticket.firstticket.requestDTOs;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@ToString
@Component
@XmlAccessorType(XmlAccessType.FIELD)
public class Line {

    @XmlElement(name = "CI_DESCRIPTION")
    private String ciDescription;
    @XmlElement(name = "PRODUCT_CODE")
    private Long productCode;
    @XmlElement(name = "COUNTRY_OF_MANUFACTURE")
    private String countryOfManufacture;
    @XmlElement(name = "UNIT_VALUE")
    private Float unitValue;
    @XmlElement(name = "UNIT_WEIGHT")
    private Float unitWeight;
    @XmlElement(name = "QUANTITY")
    private Integer quantity;
    @XmlElement(name = "QUANTITY_UNIT_MEASURE")
    private String quantityUnitMeasure;
    @XmlElement(name = "HARMONIZED_CODE")
    private String harmonizedCode;

    public String getCiDescription() {
        return ciDescription;
    }

    public void setCiDescription(String ciDescription) {
        this.ciDescription = ciDescription;
    }

    public Long getProductCode() {
        return productCode;
    }

    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }

    public String getCountryOfManufacture() {
        return countryOfManufacture;
    }

    public void setCountryOfManufacture(String countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public Float getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(Float unitValue) {
        this.unitValue = unitValue;
    }

    public Float getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(Float unitWeight) {
        this.unitWeight = unitWeight;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getQuantityUnitMeasure() {
        return quantityUnitMeasure;
    }

    public void setQuantityUnitMeasure(String quantityUnitMeasure) {
        this.quantityUnitMeasure = quantityUnitMeasure;
    }

    public String getHarmonizedCode() {
        return harmonizedCode;
    }

    public void setHarmonizedCode(String harmonizedCode) {
        this.harmonizedCode = harmonizedCode;
    }


}
