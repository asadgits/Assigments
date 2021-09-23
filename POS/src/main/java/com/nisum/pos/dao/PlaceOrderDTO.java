package com.nisum.pos.dao;

import com.nisum.pos.entities.OrderInDetail;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PlaceOrderDTO {

    private Integer id;
    private LocalDate date;
    private List<OrderInDetail> orderInDetailList;

}
