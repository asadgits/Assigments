package com.nisum.ticket.firstticket.responseDTOs;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlElement;

@Data
@Component
public class Common {

    @XmlElement(name = "TOTAL")
    private Integer total;
    @XmlElement(name = "BASE")
    private Integer base;
    @XmlElement(name = "DISCOUNT")
    private Integer discount;
    @XmlElement(name = "SPECIAL")
    private Integer special;
    @XmlElement(name = "ZONE")
    private String zone;
    @XmlElement(name = "RATED_WEIGHT")
    private Integer ratedWeight;
    @XmlElement(name = "COMMERCIAL_INVOICE")
    private String commercailInvoice;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getSpecial() {
        return special;
    }

    public void setSpecial(Integer special) {
        this.special = special;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public Integer getRatedWeight() {
        return ratedWeight;
    }

    public void setRatedWeight(Integer ratedWeight) {
        this.ratedWeight = ratedWeight;
    }

    public String getCommercailInvoice() {
        return commercailInvoice;
    }

    public void setCommercailInvoice(String commercailInvoice) {
        this.commercailInvoice = commercailInvoice;
    }



}
