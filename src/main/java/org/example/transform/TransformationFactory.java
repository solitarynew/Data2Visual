package org.example.transform;

public class TransformationFactory {
    public static TransformationFactory INSTANCE = new TransformationFactory();

    private View2AntDesignProTransformation view2AntDesignProTransformation = new View2AntDesignProTransformation();

    private Schema2GraphQLTransformation schema2GraphQLTransformation = new Schema2GraphQLTransformation();

    public static enum TransformationType {
        View2AntDesignProTransformation,
        Schema2GraphQLTransformation
    }

    public Transformation getTransformation(TransformationType transformationName) {
        if (transformationName.equals(TransformationType.View2AntDesignProTransformation)) {
            return view2AntDesignProTransformation;
        } else if (transformationName.equals(TransformationType.Schema2GraphQLTransformation)) {
            return schema2GraphQLTransformation;
        } else {
            throw new UnsupportedOperationException("Not supported transformation");
        }
    }
}
