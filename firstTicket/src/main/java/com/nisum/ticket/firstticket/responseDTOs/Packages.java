package com.nisum.ticket.firstticket.responseDTOs;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

@Component
public class Packages {

    @XmlElement(name = "PS_VOID_ID")
    private Integer psVoidId;
    @XmlElement(name = "TRACKING_NUMBER")
    private Integer trackingNumber;
    @XmlElement(name = "COMMITMENT_TIME")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date commitmentTime;
    @XmlElement(name = "PACKAGE_LABEL")
    private String packageLabel;


    public Integer getPsVoidId() {
        return psVoidId;
    }

    public void setPsVoidId(Integer psVoidId) {
        this.psVoidId = psVoidId;
    }

    public Integer getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(Integer trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Date getCommitmentTime() {
        return commitmentTime;
    }

    public void setCommitmentTime(Date commitmentTime) {
        this.commitmentTime = commitmentTime;
    }

    public String getPackageLabel() {
        return packageLabel;
    }

    public void setPackageLabel(String packageLabel) {
        this.packageLabel = packageLabel;
    }

}
