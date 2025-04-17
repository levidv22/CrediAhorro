package upeu.edu.pe.crediadmin_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //habilitar el registro en el registry-server
public class CrediadminCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrediadminCoreApplication.class, args);
	}

}
