package com.nisum.ticket.firstticket.service;

import com.nisum.ticket.firstticket.requestDTOs.ShipmentrequestDto;
import com.nisum.ticket.firstticket.responseDTOs.ShipmentresponseDto;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${javainuse.rabbitmq.exchange}")
    private String exchange;

    @Value("${javainuse.rabbitmq.routingkey}")
    private String routingkey;

    public void send(ShipmentresponseDto shipmentresponseDto) {
        rabbitTemplate.convertAndSend(exchange, routingkey, shipmentresponseDto);
        System.out.println("Send msg = " + shipmentresponseDto);

    }
}
