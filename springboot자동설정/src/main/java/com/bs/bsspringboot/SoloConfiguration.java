package com.bs.bsspringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoloConfiguration {

    @Bean
    public Solo solo(){
        Solo solo=new Solo();
        solo.setName("js");
        solo.setHowLong(5);

        return solo;
    }
}
