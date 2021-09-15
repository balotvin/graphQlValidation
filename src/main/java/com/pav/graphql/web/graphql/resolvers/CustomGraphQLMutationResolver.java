package com.pav.graphql.web.graphql.resolvers;

import graphql.kickstart.tools.GraphQLMutationResolver;

import java.util.concurrent.CompletableFuture;
import com.pav.graphql.web.model.MutationInput;
import com.pav.graphql.web.model.MutationResponse;
import com.pav.graphql.web.model.NestedResponsePart;
import org.springframework.stereotype.Service;

@Service
public class CustomGraphQLMutationResolver implements GraphQLMutationResolver {

    public CompletableFuture<MutationResponse> testMutation(final MutationInput mutationInput) {
        final MutationResponse respModel = new MutationResponse();
        final NestedResponsePart nestedResponsePart = new NestedResponsePart();
        nestedResponsePart.setNestedPartValue("Y");
        respModel.setNestedPart(nestedResponsePart);
        respModel.setResponse("Invalid");
        return CompletableFuture.supplyAsync(() -> respModel);
    }
}
