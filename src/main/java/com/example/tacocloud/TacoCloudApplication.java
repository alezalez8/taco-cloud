package com.example.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }

}

//    в командной строке наберите  netstat -o -n -a | findstr 0.0:8080
//    и потом в диспетчере задач в службах по ИД процесса найдите службу