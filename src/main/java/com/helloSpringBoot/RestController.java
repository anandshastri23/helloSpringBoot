package com.helloSpringBoot;
import globalWeather.wsdl.GetCitiesByCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
    @Autowired
    CitiesByCountry citiesByCountry;
    @GetMapping("/hello")
    public GetCitiesByCountryResponse sayHello(){
        GetCitiesByCountryResponse response = citiesByCountry.getCitiesByCountry();
		System.out.println(response.getGetCitiesByCountryResult());
        return response;
    }
}
