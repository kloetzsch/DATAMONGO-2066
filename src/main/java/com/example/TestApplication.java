package com.example;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestApplication
{

    public static void main(String[] args)
    {
        ConfigurableApplicationContext ctx = SpringApplication.run(TestApplication.class, args);
        TestEntityRepository repo = ctx.getBean(TestEntityRepository.class);
        TestEntity testObject = new TestEntity(1000, 6);
        repo.deleteAll();
        repo.save(testObject);
        List<TestEntity> foundObjects = repo.findAll();
    }
}
