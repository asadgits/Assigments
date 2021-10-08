package com.nisum.ticket.firstticket.service;

import com.nisum.ticket.firstticket.requestDTOs.ShipmentrequestDto;
import com.nisum.ticket.firstticket.responseDTOs.ShipmentresponseDto;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface Shipment {
    public ShipmentresponseDto insertShipment(ShipmentrequestDto shipmentrequestDto) throws IOException;
}
