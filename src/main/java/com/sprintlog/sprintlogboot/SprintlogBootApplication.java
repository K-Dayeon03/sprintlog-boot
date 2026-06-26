package com.sprintlog.sprintlogboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//BaseEntity의 @CreatedDate/@LastModifiedDate자동 채움 기능을 켠다
//이거 없으면 둘 다 null로 들어간다.
@EnableJpaAuditing
@SpringBootApplication
public class SprintlogBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintlogBootApplication.class, args);
    }

}
