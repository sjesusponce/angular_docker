package mx.com.testCI.AngularDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="mx.com.testCI")
public class AngularDockerApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(AngularDockerApplication.class, args);
	}
	
}
