package com.example;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TestEntity
{

    @Id
    private final Integer id;
    private final Integer propA;
    private final Integer propB;

    public TestEntity(Integer id, Integer propA)
    {
        this.id = id;
        this.propB = propA + 5;
        this.propA = propA;
    }

}
