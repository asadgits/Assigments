package com.nisum.ticket.firstticket.requestDTOs;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Component
@XmlAccessorType(XmlAccessType.FIELD)
public class International {
    @XmlElement(name = "LINE")
    private Line line;

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }
}
