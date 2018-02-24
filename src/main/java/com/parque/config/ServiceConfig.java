package com.parque.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.parque.service.ContaService;



@Configuration
@ComponentScan(basePackageClasses = ContaService.class)
public class ServiceConfig {

}


