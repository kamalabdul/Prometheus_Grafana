package com.example.Prometheus_Grafana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrometheusGrafanaApplication {

	public static void main(String[] args) {
		
		
		//SpringApplication.run(PrometheusGrafanaApplication.class, args);
		
		try {
		    SpringApplication.run(PrometheusGrafanaApplication.class, args);
		    System.out.println("Application started successfully");
		} catch (Exception e) {
			System.out.println("Failed to start application: " +  e.getMessage());
		    System.exit(1);
		}
		
		
	}

}


