package com.helloSpringBoot;

import globalWeather.wsdl.GetCitiesByCountryResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapRestController {

    CitiesByCountry citiesByCountry;

    public SoapRestController(CitiesByCountry citiesByCountry) {
        this.citiesByCountry = citiesByCountry;
    }

    @GetMapping("/hello")
    public GetCitiesByCountryResponse sayHello(){
        GetCitiesByCountryResponse response = citiesByCountry.getCitiesByCountry();
		System.out.println(response.getGetCitiesByCountryResult());
        return response;
    }
}
