package com.pav.graphql.web.model;

public class Application {

    private String name;
    private Nested nested;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }
}
