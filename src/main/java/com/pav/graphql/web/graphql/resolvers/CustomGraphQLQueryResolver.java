package com.pav.graphql.web.graphql.resolvers;

import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.concurrent.CompletableFuture;
import com.pav.graphql.web.model.Application;
import com.pav.graphql.web.model.QueryResponse;
import org.springframework.stereotype.Service;

@Service
public class CustomGraphQLQueryResolver implements GraphQLQueryResolver {

    public CompletableFuture<QueryResponse> testQuery(final Application app) {
        QueryResponse respModel = new QueryResponse();
        respModel.setResponse("Return response for Test Query:valid id " + app.getName());
        return CompletableFuture.supplyAsync(() -> respModel);
    }
}
