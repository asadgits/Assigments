package com.nisum.ticket.firstticket.controller;

import com.nisum.ticket.firstticket.FirstTicketApplication;
import com.nisum.ticket.firstticket.requestDTOs.*;
import com.nisum.ticket.firstticket.requestDTOs.CommonShipment;
import com.nisum.ticket.firstticket.requestDTOs.Package;
import com.nisum.ticket.firstticket.util.XmlConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@ExtendWith(SpringExtension.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = FirstTicketApplication.class
)
@AutoConfigureMockMvc
public class TestController {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ShipmentrequestDto shipmentrequestDto;
    @Autowired
    private CommonShipment commonShipment;
    @Autowired
    private Package aPackage;
    @Autowired
    private International international;
    @Autowired
    private Line line;
    @Autowired
    XmlConverter xmlConverter;


    @Test
    public void insertData() throws Exception {
        StringWriter stringWriter = null;

        line.setCiDescription("Test stuff");
        line.setProductCode(456789123L);
        line.setCountryOfManufacture("US");
        line.setUnitValue(5.00F);
        line.setUnitWeight(5.00F);
        line.setQuantity(5);
        line.setQuantityUnitMeasure("EA");
        line.setHarmonizedCode("3209.90.00");

        international.setLine(line);

        commonShipment.setTerms("SHIPPER");
        commonShipment.setShipDate(new Date("21/2/2021"));
        commonShipment.setShipperReference(23L);
        commonShipment.setConsigneeReference(234254325L);
        commonShipment.setShipper("TEST");
        commonShipment.setConsigneeCompany("ACME Falling Safe Co");
        commonShipment.setConsigneeContact("Mike Hoffman");
        commonShipment.setConsigneeAddress1("1060 W. Addison");
        commonShipment.setConsigneeCity("Chicago");
        commonShipment.setConsigneeState("IL");
        commonShipment.setConsigneePostalCode(60613);
        commonShipment.setConsigneeCountry("US");
        commonShipment.setConsigneePhone("555-555-5555");
        commonShipment.setCondigneeResidential(true);
        commonShipment.setSaturdayDelivery(false);
        commonShipment.setSenderEIN("12-1234567");
        commonShipment.setDescription("Sporting Goo-ds");
        commonShipment.setInternational(international);

        aPackage.setPackaging("CUSTOM");
        aPackage.setWeight(1);
        aPackage.setDimension("5x5x5");
        aPackage.setProofRequireSignature(true);

        shipmentrequestDto.setService("THIS IS SHIPMENT SERVICE !!!");
        shipmentrequestDto.setCommonShipment(commonShipment);
        shipmentrequestDto.setShipmentPackage(aPackage);

        //Converting Object To XML
        stringWriter = xmlConverter.objectToXml(shipmentrequestDto);

        /*START TESTING CODE FROM HERE*/

        MvcResult result = mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .post("/shipment/V1/")
                                .contentType(MediaType.APPLICATION_XML_VALUE)
                                .accept(MediaType.APPLICATION_XML_VALUE)
                                .content(String.valueOf(stringWriter))

                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(
                        MockMvcResultMatchers
                                .content()
                                .contentTypeCompatibleWith(MediaType.APPLICATION_XML_VALUE)
                ).andDo(print()).andReturn();


        System.out.println("\n\n <<<<<<<<<<<<<<<<<<<<<<<<<< PRINTING XML RESPONSE >>>>>>>>>>>>>>>>>>>>> \n\n");
        System.out.println(format(result.getResponse().getContentAsString()));
        System.out.println("\n\n\n");

    }

    public String format(String input) {
        return prettyFormat(input, "2");
    }

    public static String prettyFormat(String input, String indent) {
        Source xmlInput = new StreamSource(new StringReader(input));
        StringWriter stringWriter = new StringWriter();
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes");
            transformer.setOutputProperty("{https://xml.apache.org/xslt}indent-amount", indent);
            transformer.transform(xmlInput, new StreamResult(stringWriter));

            return stringWriter.toString().trim();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
