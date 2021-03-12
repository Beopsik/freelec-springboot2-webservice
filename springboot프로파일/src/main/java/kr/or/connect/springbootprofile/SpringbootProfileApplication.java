package kr.or.connect.springbootprofile;

import kr.or.connect.springbootprofile.config.MyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyProperties.class)
public class SpringbootProfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProfileApplication.class, args);
    }

}
