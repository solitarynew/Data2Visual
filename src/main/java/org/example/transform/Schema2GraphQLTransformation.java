package org.example.transform;

import GraphQL.*;
import GraphQL.impl.GraphQLFactoryImpl;
import graphql.language.*;
import graphql.language.Argument;
import graphql.language.Directive;
import graphql.language.Type;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import java.util.List;
import java.util.Map;

public class Schema2GraphQLTransformation implements Transformation{

    @Override
    public EList<EObject> transform(Object o, Map<String, Object> options) {
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
                ObjectType type = GraphQLFactoryImpl.eINSTANCE.createObjectType();
                type.setName(objectTypeDefinition.getName());
                for (FieldDefinition fieldDefinition : objectTypeDefinition.getFieldDefinitions()) {
                    type.getAttribute().add(transformAttribute(fieldDefinition));
                }
                for (Directive directive : objectTypeDefinition.getDirectives()) {
                    type.getDirective().add(transformDirective(directive));
                }
                schema.getType().add(type);
            } else if (typeDefinition instanceof InterfaceTypeDefinition) {
                InterfaceTypeDefinition interfaceTypeDefinition = (InterfaceTypeDefinition) typeDefinition;
                InterfaceType type = GraphQLFactoryImpl.eINSTANCE.createInterfaceType();
                type.setName(interfaceTypeDefinition.getName());
                for (FieldDefinition fieldDefinition : interfaceTypeDefinition.getFieldDefinitions()) {
                    type.getAttribute().add(transformAttribute(fieldDefinition));
                }
                for (Directive directive : interfaceTypeDefinition.getDirectives()) {
                    type.getDirective().add(transformDirective(directive));
                }
                schema.getType().add(type);
            } else if (typeDefinition instanceof EnumTypeDefinition) {
                EnumTypeDefinition enumTypeDefinition = (EnumTypeDefinition) typeDefinition;
                EnumType type = GraphQLFactoryImpl.eINSTANCE.createEnumType();
                type.setName(enumTypeDefinition.getName());
                for (Directive directive : enumTypeDefinition.getDirectives()) {
                    type.getDirective().add(transformDirective(directive));
                }
                schema.getType().add(type);
            } else if (typeDefinition instanceof ScalarTypeDefinition) {
                ScalarTypeDefinition scalarTypeDefinition = (ScalarTypeDefinition) typeDefinition;
                ScalarType type = GraphQLFactoryImpl.eINSTANCE.createScalarType();
                type.setName(scalarTypeDefinition.getName());
                for (Directive directive : scalarTypeDefinition.getDirectives()) {
                    type.getDirective().add(transformDirective(directive));
                }
                schema.getType().add(type);
            }
        }
        return eObjects;
    }

    public Attribute transformAttribute(FieldDefinition fieldDefinition) {
        Attribute attribute = GraphQLFactoryImpl.eINSTANCE.createAttribute();
        // set name
        attribute.setName(fieldDefinition.getName());

        // set type
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
        if (fieldType instanceof  NonNullType) {
            fieldType = ((NonNullType) fieldType).getType();
            attribute.setIsNullableInArray(false);
        } else {
            attribute.setIsNullableInArray(true);
        }
        if (fieldType instanceof TypeName) {
            attribute.setTypeName(((TypeName) fieldType).getName());
        }

        // set directives
        List<Directive> directives = fieldDefinition.getDirectives();
        for (Directive directive : directives) {
            attribute.getDirective().add(transformDirective(directive));
        }
        return attribute;
    }

    public GraphQL.Directive transformDirective(Directive directive) {
        GraphQL.Directive dir = GraphQLFactoryImpl.eINSTANCE.createDirective();
        dir.setName(directive.getName());
        for (Argument argument : directive.getArguments()) {
            dir.getArgument().add(transformArgument(argument));
        }
        return dir;
    }

    public GraphQL.Argument transformArgument(Argument argument) {
        GraphQL.Argument arg = GraphQLFactoryImpl.eINSTANCE.createArgument();
        arg.setName(argument.getName());
        arg.setValue(argument.getValue());
        return arg;
    }
}
