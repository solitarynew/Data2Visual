package org.example.transform;

public class TransformationFactory {
    public static TransformationFactory INSTANCE = new TransformationFactory();

    private View2AntDesignProTransformation view2AntDesignProTransformation = new View2AntDesignProTransformation();

    private Schema2GraphQLTransformation schema2GraphQLTransformation = new Schema2GraphQLTransformation();

    private GraphQL2QueryOrMutationTransformation graphQL2QueryOrMutationTransformation = new GraphQL2QueryOrMutationTransformation();

    public static enum TransformationType {
        View2AntDesignProTransformation,
        Schema2GraphQLTransformation,
        graphQL2QueryOrMutationTransformation
    }

    public Transformation getTransformation(TransformationType transformationName) {
        if (transformationName.equals(TransformationType.View2AntDesignProTransformation)) {
            return view2AntDesignProTransformation;
        } else if (transformationName.equals(TransformationType.Schema2GraphQLTransformation)) {
            return schema2GraphQLTransformation;
        } else if (transformationName.equals(TransformationType.graphQL2QueryOrMutationTransformation)) {
            return graphQL2QueryOrMutationTransformation;
        } else {
            throw new UnsupportedOperationException("Not supported transformation");
        }
    }
}
