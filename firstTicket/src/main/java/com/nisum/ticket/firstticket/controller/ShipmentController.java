package com.nisum.ticket.firstticket.controller;

import com.nisum.ticket.firstticket.requestDTOs.ShipmentrequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipment/V1/")
public class ShipmentController {

    @PostMapping
    public void insertShipment(@RequestBody ShipmentrequestDto shipmentrequestDto){
        System.out.println(shipmentrequestDto);
    }
}
