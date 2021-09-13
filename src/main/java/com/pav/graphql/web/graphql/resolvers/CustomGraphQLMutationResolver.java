package com.pav.graphql.web.graphql.resolvers;

import graphql.kickstart.tools.GraphQLMutationResolver;

import java.util.concurrent.CompletableFuture;
import com.pav.graphql.web.model.MutationResponse;
import org.springframework.stereotype.Service;

@Service
public class CustomGraphQLMutationResolver implements GraphQLMutationResolver {

    public CompletableFuture<MutationResponse> testMutation(final String id, final String name, final int value) {
        MutationResponse respModel = new MutationResponse();
        respModel.setResponse("Return response for Test Mutation:valid data " + id + ", name " + name + ", value " + value);
        return CompletableFuture.supplyAsync(() -> respModel);
    }
}
