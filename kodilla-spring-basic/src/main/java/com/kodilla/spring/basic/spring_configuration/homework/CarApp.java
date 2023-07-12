package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarApp {
    @Bean
    public Car car() {
        int month = LocalDate.now().getMonthValue();
        if (month >= 3 && month <= 5 || month >= 9 && month <= 11) {
            return new Sedan();
        } else if (month >= 6 && month <= 8) {
            return new Cabrio();
        } else {
            return new SUV();
        }
    }

}
