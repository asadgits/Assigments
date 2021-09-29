package com.nisum.ticket.firstticket.requestDTOs;

import lombok.Data;

@Data
public class ShipmentrequestDto {
    private Common ShipmentCommon;
    private Package shipmentPackage;
    private String shipmentService;
}
