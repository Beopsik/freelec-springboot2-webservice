package kr.or.connect.springbootconfigurationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Myproperties.class)
public class SpringbootConfigurationpropertiesApplication {

    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(SpringbootConfigurationpropertiesApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
