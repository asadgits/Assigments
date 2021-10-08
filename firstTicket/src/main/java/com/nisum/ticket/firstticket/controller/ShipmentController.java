package com.nisum.ticket.firstticket.controller;

import com.nisum.ticket.firstticket.requestDTOs.ShipmentrequestDto;
import com.nisum.ticket.firstticket.responseDTOs.ShipmentresponseDto;
import com.nisum.ticket.firstticket.service.Shipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    Shipment shipment;

    @Autowired
    public ShipmentController(Shipment shipment ) {
        this.shipment = shipment;
    }

    @PostMapping(produces = MediaType.APPLICATION_XML_VALUE,consumes = MediaType.APPLICATION_XML_VALUE)
    public ShipmentresponseDto insertShipment(@RequestBody  ShipmentrequestDto shipmentrequestDto) throws IOException {
        return shipment.insertShipment(shipmentrequestDto);
    }

}
