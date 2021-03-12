package kr.or.connect.springbootconfigurationproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Myproperties myproperties;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        System.out.println(myproperties.getName());
        System.out.println(myproperties.getAge());
        System.out.println(myproperties.getFullName());
    }
}
