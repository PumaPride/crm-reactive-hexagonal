package com.imatia.crmreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* Mi intención era dejar esta clase en com.imatia.crmreactive.app.infrastructure
* Pero me da error al inyectar las dependencias al iniciar la aplicación
* Desde el directorio base del proyecto no da error
*/
@SpringBootApplication(scanBasePackages={"com.imatia.crmreactive"})
public class CrmReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmReactiveApplication.class, args);
	}

}
