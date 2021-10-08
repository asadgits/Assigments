package com.nisum.ticket.firstticket.util;

import com.nisum.ticket.firstticket.requestDTOs.ShipmentrequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

@Component
public class XmlConverter {

    private StringWriter stringWriter;

    public StringWriter objectToXml(Object object){

        try {
            // create an instance of `JAXBContext`
            JAXBContext context = JAXBContext.newInstance(ShipmentrequestDto.class);

            // create an instance of `Marshaller`
            Marshaller marshaller = context.createMarshaller();

            // enable pretty-print XML output
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // write XML to `StringWriter`
            stringWriter = new StringWriter();

            // convert book object to XML
            marshaller.marshal(object, stringWriter);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }


        return stringWriter;
    }

}
