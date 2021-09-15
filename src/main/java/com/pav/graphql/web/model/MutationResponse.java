package com.pav.graphql.web.model;

import java.io.Serializable;

public class MutationResponse implements Serializable {

    private NestedResponsePart nestedPart;
    private String response;

    public NestedResponsePart getNestedPart() {
        return nestedPart;
    }

    public void setNestedPart(NestedResponsePart nestedPart) {
        this.nestedPart = nestedPart;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
