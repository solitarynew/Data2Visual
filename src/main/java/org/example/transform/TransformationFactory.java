package org.example.transform;

public class TransformationFactory {
    public static TransformationFactory INSTANCE = new TransformationFactory();

    private View2AntDesignProTransformation view2AntDesignProTransformation = new View2AntDesignProTransformation();

    public Transformation getTransformation(String transformationName) {
        if (transformationName.equals("View2AntDesignProTransformation")) {
            return view2AntDesignProTransformation;
        }
        return null;
    }
}
