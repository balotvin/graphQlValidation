package com.epam.graphql.web.model;

import java.io.Serializable;

public class MutationResponse implements Serializable {

    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
