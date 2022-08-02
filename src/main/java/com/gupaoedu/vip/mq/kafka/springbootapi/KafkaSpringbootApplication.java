package com.gupaoedu.vip.mq.kafka.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * @Author qiyj
 * @create 2022/8/2
 */
@EnableKafka
@SpringBootApplication
public class KafkaSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringbootApplication.class,args);
    }
}
