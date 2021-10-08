package com.nisum.ticket.firstticket.responseDTOs;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Component
@XmlRootElement
public class ShipmentresponseDto {


    private String service;
    @XmlElement(name = "ERROR")
    private String error;

    @XmlElement(name = "PACKAGE")
    private Packages shipmentPackage;
    @XmlElement(name = "COMMON")
    private Common common;

    @XmlElement(name = "SERVICE")
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }


    public Packages getShipmentPackage() {
        return shipmentPackage;
    }

    public void setShipmentPackage(Packages shipmentPackage) {
        this.shipmentPackage = shipmentPackage;
    }

    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }



}
