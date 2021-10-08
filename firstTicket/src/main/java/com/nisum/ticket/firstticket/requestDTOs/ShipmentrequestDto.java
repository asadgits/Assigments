package com.nisum.ticket.firstticket.requestDTOs;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = ShipmentrequestDto.class)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@XmlRootElement(name = "SHIPMENT")
@Component
@XmlAccessorType(XmlAccessType.FIELD)
public class ShipmentrequestDto {

    @XmlElement(name = "SERVICE")
    private String service;

    @XmlElement(name = "COMMON")
    private CommonShipment commonShipment;

    @XmlElement(name = "PACKAGE")
    private Package shipmentPackage;

    public CommonShipment getCommonShipment() {
        return commonShipment;
    }

    public void setCommonShipment(CommonShipment commonShipment) {
        this.commonShipment = commonShipment;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Package getShipmentPackage() {
        return shipmentPackage;
    }

    public void setShipmentPackage(Package shipmentPackage) {
        this.shipmentPackage = shipmentPackage;
    }



}
