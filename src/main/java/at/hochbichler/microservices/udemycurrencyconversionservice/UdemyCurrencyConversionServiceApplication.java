package at.hochbichler.microservices.udemycurrencyconversionservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("at.hochbichler.microservices.udemycurrencyconversionservice")
@EnableDiscoveryClient
public class UdemyCurrencyConversionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UdemyCurrencyConversionServiceApplication.class, args);
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
