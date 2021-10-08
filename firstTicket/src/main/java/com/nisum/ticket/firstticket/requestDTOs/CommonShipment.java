package com.nisum.ticket.firstticket.requestDTOs;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@Component
@XmlAccessorType(XmlAccessType.FIELD)
public class CommonShipment {

    @XmlElement(name = "TERMS")
    private String terms;
    @XmlElement(name = "SHIPDATE")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date shipDate;
    @XmlElement(name = "SHIPPER_REFERENCE")
    private Long shipperReference;
    @XmlElement(name = "CONSIGNEE_REFERENCE")
    private Long consigneeReference;
    @XmlElement(name = "SHIPPER")
    private String shipper;
    @XmlElement(name = "CONSIGNEE_COMPANY")
    private String consigneeCompany;
    @XmlElement(name = "CONSIGNEE_CONTACT")
    private String consigneeContact;
    @XmlElement(name = "CONSIGNEE_ADDRESS1")
    private String consigneeAddress1;
    @XmlElement(name = "CONSIGNEE_CITY")
    private String consigneeCity;
    @XmlElement(name = "CONSIGNEE_STATE")
    private String consigneeState;
    @XmlElement(name = "CONSIGNEE_POSTALCODE")
    private Integer consigneePostalCode;
    @XmlElement(name = "CONSIGNEE_COUNTRY")
    private String consigneeCountry;
    @XmlElement(name = "CONSIGNEE_PHONE")
    private String consigneePhone;
    @XmlElement(name = "CONSIGNEE_RESIDENTIAL")
    private boolean condigneeResidential;
    @XmlElement(name = "SATURDAY_DELIVERY")
    private boolean saturdayDelivery;
    @XmlElement(name = "SENDER_EIN")
    private String senderEIN;
    @XmlElement(name = "DESCRIPTION")
    private String description;

    @XmlElement(name = "INTERNATIONAL")
    private International international;

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public Long getShipperReference() {
        return shipperReference;
    }

    public void setShipperReference(Long shipperReference) {
        this.shipperReference = shipperReference;
    }

    public Long getConsigneeReference() {
        return consigneeReference;
    }

    public void setConsigneeReference(Long consigneeReference) {
        this.consigneeReference = consigneeReference;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }

    public String getConsigneeCompany() {
        return consigneeCompany;
    }

    public void setConsigneeCompany(String consigneeCompany) {
        this.consigneeCompany = consigneeCompany;
    }

    public String getConsigneeContact() {
        return consigneeContact;
    }

    public void setConsigneeContact(String consigneeContact) {
        this.consigneeContact = consigneeContact;
    }

    public String getConsigneeAddress1() {
        return consigneeAddress1;
    }

    public void setConsigneeAddress1(String consigneeAddress1) {
        this.consigneeAddress1 = consigneeAddress1;
    }

    public String getConsigneeCity() {
        return consigneeCity;
    }

    public void setConsigneeCity(String consigneeCity) {
        this.consigneeCity = consigneeCity;
    }

    public String getConsigneeState() {
        return consigneeState;
    }

    public void setConsigneeState(String consigneeState) {
        this.consigneeState = consigneeState;
    }

    public Integer getConsigneePostalCode() {
        return consigneePostalCode;
    }

    public void setConsigneePostalCode(Integer consigneePostalCode) {
        this.consigneePostalCode = consigneePostalCode;
    }

    public String getConsigneeCountry() {
        return consigneeCountry;
    }

    public void setConsigneeCountry(String consigneeCountry) {
        this.consigneeCountry = consigneeCountry;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public boolean isCondigneeResidential() {
        return condigneeResidential;
    }

    public void setCondigneeResidential(boolean condigneeResidential) {
        this.condigneeResidential = condigneeResidential;
    }

    public boolean isSaturdayDelivery() {
        return saturdayDelivery;
    }

    public void setSaturdayDelivery(boolean saturdayDelivery) {
        this.saturdayDelivery = saturdayDelivery;
    }

    public String getSenderEIN() {
        return senderEIN;
    }

    public void setSenderEIN(String senderEIN) {
        this.senderEIN = senderEIN;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public International getInternational() {
        return international;
    }

    public void setInternational(International international) {
        this.international = international;
    }


}
