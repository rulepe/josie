package projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"projeto.model"})
//@EnableJpaRepositories(basePackages = {"projeto.repository"})
@ComponentScan(basePackages= {"projeto.controller"})
public class JosieApplication extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(JosieApplication.class, args);
	}

}
