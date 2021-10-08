package com.nisum.ticket.firstticket.requestDTOs;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Component
@XmlAccessorType(XmlAccessType.FIELD)
public class Package {
    @XmlElement(name = "PACKAGING")
    private String packaging;
    @XmlElement(name = "WEIGHT")
    private Integer weight;
    @XmlElement(name = "DIMENSION")
    private String dimension;
    @XmlElement(name = "PROOF_REQUIRE_SIGNATURE")
    private boolean proofRequireSignature;


    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public boolean isProofRequireSignature() {
        return proofRequireSignature;
    }

    public void setProofRequireSignature(boolean proofRequireSignature) {
        this.proofRequireSignature = proofRequireSignature;
    }

}
