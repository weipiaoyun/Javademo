package com.example.consumingrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {
    private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);
    public static void main(String[] args) {
        RestTemplate restTemplate  = new RestTemplate();
        Quote quote = restTemplate.getForObject(
                "http://172.19.99.2:6688/api/EAP/PlcConnect/ReadPLCData?equipmentCode=FAE-PTH-005_SXBJ&dataAdress=D1000", Quote.class);
        SpringApplication.run(ConsumingRestApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Quote quote = restTemplate.getForObject(
                    "http://172.19.99.2:6688/api/EAP/PlcConnect/ReadPLCData?equipmentCode=FAE-PTH-005_SXBJ&dataAdress=D1000", Quote.class);
            log.info(quote.toString());
        };
    }

}
