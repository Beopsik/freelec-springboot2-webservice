package kr.or.connect.springbootprofile;

import kr.or.connect.springbootprofile.config.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    private String hello;

    @Autowired
    private MyProperties myProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println(myProperties.getName());
        System.out.println(myProperties.getFullname());
    }
}
