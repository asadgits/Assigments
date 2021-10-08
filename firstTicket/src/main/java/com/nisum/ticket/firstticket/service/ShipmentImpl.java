package com.nisum.ticket.firstticket.service;

import com.nisum.ticket.firstticket.requestDTOs.ShipmentrequestDto;
import com.nisum.ticket.firstticket.responseDTOs.Common;
import com.nisum.ticket.firstticket.responseDTOs.Packages;
import com.nisum.ticket.firstticket.responseDTOs.ShipmentresponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;

@Service
public class ShipmentImpl implements Shipment{

    @Autowired
    ShipmentresponseDto shipmentresponseDto;

    @Autowired
    Packages packages;

    @Autowired
    Common common;



    @Override
    public ShipmentresponseDto insertShipment(ShipmentrequestDto shipmentrequestDto) throws IOException {

        common.setTotal(100);
        common.setBase(200);
        common.setDiscount(50);
        common.setSpecial(10);
        common.setZone("EAST");
        common.setRatedWeight(5);
        common.setCommercailInvoice("IMAGE");

        packages.setPsVoidId(12345);
        packages.setTrackingNumber(7654);
        packages.setPackageLabel("RED");
        packages.setCommitmentTime(new Date("20/2/2021"));



        shipmentresponseDto.setService("pakistan");
        shipmentresponseDto.setError("NO ERROR");
        shipmentresponseDto.setCommon(common);
        shipmentresponseDto.setShipmentPackage(packages);


        return shipmentresponseDto;
    }
}