package com.nisum.ticket.firstticket.controller;

import com.nisum.ticket.firstticket.responseDTOs.Common;
import com.nisum.ticket.firstticket.responseDTOs.Packages;
import com.nisum.ticket.firstticket.responseDTOs.ShipmentresponseDto;
import com.nisum.ticket.firstticket.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/rabbit/")
public class RabbitMQWebController {

    @Autowired
    RabbitMQSender rabbitMQSender;

    @Autowired
    ShipmentresponseDto shipmentresponseDto;

    @Autowired
    Packages packages;

    @Autowired
    Common common;


    @GetMapping
    public String producer() {
        System.out.println("in to the producer Method");

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


        rabbitMQSender.send(shipmentresponseDto);

        return "Message sent to the RabbitMQ ShipmentResponse Successfully";
    }

}
