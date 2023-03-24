package org.example.transform;

import GraphQL.Attribute;
import GraphQL.Schema;
import GraphQL.SystemType;
import GraphQL.impl.GraphQLFactoryImpl;
import graphql.language.*;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import java.util.List;

public class Schema2GraphQLTransformation implements Transformation{

    @Override
    public EList<EObject> transform(Object o) {
        if (!(o instanceof TypeDefinitionRegistry)) {
            throw new IllegalArgumentException("Source Model is not a TypeDefinitionRegistry");
        }
        TypeDefinitionRegistry typeDefinitionRegistry = (TypeDefinitionRegistry) o;
        EList<EObject> eObjects = new BasicEList<>();
        Schema schema = GraphQLFactoryImpl.eINSTANCE.createSchema();
        eObjects.add(schema);
        for (TypeDefinition typeDefinition : typeDefinitionRegistry.types().values()) {
            if (typeDefinition instanceof ObjectTypeDefinition) {
                ObjectTypeDefinition objectTypeDefinition = (ObjectTypeDefinition) typeDefinition;
                SystemType type = GraphQLFactoryImpl.eINSTANCE.createSystemType();
                type.setName(objectTypeDefinition.getName());
                for (FieldDefinition fieldDefinition : objectTypeDefinition.getFieldDefinitions()) {
                    Attribute attribute = GraphQLFactoryImpl.eINSTANCE.createAttribute();
                    attribute.setName(fieldDefinition.getName());
                    Type fieldType = fieldDefinition.getType();
                    if (fieldType instanceof NonNullType) {
                        attribute.setIsNullable(false);
                        fieldType = ((NonNullType) fieldType).getType();
                    } else {
                        attribute.setIsNullable(true);
                    }
                    if (fieldType instanceof ListType) {
                        attribute.setIsArray(true);
                        fieldType = ((ListType) fieldType).getType();
                    } else {
                        attribute.setIsArray(false);
                    }
                    // TODO: 此时可以处理 type,type!,[type],[type]!,但是不能处理[type!]和[type!]!，需要更改GraphQL的ecore定义
                    if (fieldType instanceof  NonNullType) {
                        fieldType = ((NonNullType) fieldType).getType();
                    }
                    if (fieldType instanceof TypeName) {
                        attribute.setTypeName(((TypeName) fieldType).getName());
                    }
                    type.getAttribute().add(attribute);
                }
                schema.getType().add(type);
            }
        }
        return eObjects;
    }
}
