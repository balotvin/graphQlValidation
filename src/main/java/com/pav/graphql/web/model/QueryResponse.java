package com.pav.graphql.web.model;

import java.io.Serializable;

public class QueryResponse implements Serializable {

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
