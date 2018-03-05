package com.helloSpringBoot.basics.helloSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class MarshallingConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("globalWeather.wsdl");
        return marshaller;
    }

    @Bean
    public CitiesByCountry citiesByCountry(Jaxb2Marshaller marshaller) {
        CitiesByCountry client = new CitiesByCountry();
        client.setDefaultUri("http://www.webservicex.net/globalweather.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}