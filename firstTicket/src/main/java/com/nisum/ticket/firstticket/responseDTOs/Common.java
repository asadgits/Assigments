package com.nisum.ticket.firstticket.responseDTOs;

import lombok.Data;

@Data
public class Common {

    private Integer total;
    private Integer base;
    private Integer discount;
    private Integer sepecial;
    private String zone;
    private Integer ratedWeight;
    private byte commercailInvoice;
}
