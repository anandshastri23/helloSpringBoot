package com.helloSpringBoot;

import globalWeather.wsdl.GetCitiesByCountry;
import globalWeather.wsdl.GetCitiesByCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class CitiesByCountry extends WebServiceGatewaySupport {

    public GetCitiesByCountryResponse getCitiesByCountry() {
    GetCitiesByCountry request = new GetCitiesByCountry();
    request.setCountryName("India");

    GetCitiesByCountryResponse response = (GetCitiesByCountryResponse) getWebServiceTemplate()
            .marshalSendAndReceive("http://www.webservicex.net/globalweather.asmx", request,
                    new SoapActionCallback("http://www.webserviceX.NET/GetCitiesByCountry"));

    return response;
    }



}
