package com.nisum.ticket.firstticket.unitTests;

import com.nisum.ticket.firstticket.controller.ShipmentController;
import com.nisum.ticket.firstticket.requestDTOs.*;
import com.nisum.ticket.firstticket.requestDTOs.Package;
import com.nisum.ticket.firstticket.responseDTOs.Packages;
import com.nisum.ticket.firstticket.responseDTOs.ShipmentresponseDto;
import com.nisum.ticket.firstticket.service.Shipment;
import com.nisum.ticket.firstticket.util.XmlConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ExtendWith(SpringExtension.class)
public class serviceUnitTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Shipment shipment;

    @InjectMocks
    private ShipmentController shipmentController;

    //REQOEST OBJECTS
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


    //RESPONSE OBJECTS
    @Autowired
    ShipmentresponseDto shipmentresponseDto;
    @Autowired
    Packages packages;
    @Autowired
    com.nisum.ticket.firstticket.responseDTOs.Common common;

    @Test
    public void requestTest() throws Exception {

        Mockito.when(shipment.insertShipment(shipmentrequestDto)).thenReturn(shipmentresponseDto);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/shipment/")
                .accept(MediaType.APPLICATION_XML_VALUE)
                .contentType(MediaType.APPLICATION_XML_VALUE)
                .content(anyString());

        MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();

    }


    @Test
    public void testData() throws Exception {
        StringWriter stringWriter = null;

        //request
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

        //response

        common.setTotal(100);
        common.setBase(200);
        common.setDiscount(50);
        common.setSpecial(10);
        common.setZone("EAST");
        common.setRatedWeight(5);
        common.setCommercailInvoice("IMAGE");

        packages.setPsVoidId(12345);
        packages.setTrackingNumber(7654);
        packages.setPackageLabel("RED");
        packages.setCommitmentTime(new Date("20/2/2021"));

        shipmentresponseDto.setService("pakistan");
        shipmentresponseDto.setError("NO ERROR");
        shipmentresponseDto.setCommon(common);
        shipmentresponseDto.setShipmentPackage(packages);



        Mockito.when(shipment.insertShipment(any())).thenReturn(any());

        RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/shipment/")
                                            .accept(MediaType.APPLICATION_XML_VALUE)
                                            .contentType(MediaType.APPLICATION_XML_VALUE)
                                            .content(stringWriter.toString());

        MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();


    }
}
