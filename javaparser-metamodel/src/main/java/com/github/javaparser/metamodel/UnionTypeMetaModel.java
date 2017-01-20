package com.github.javaparser.metamodel;

import java.util.Optional;

public class UnionTypeMetaModel extends BaseNodeMetaModel {

    UnionTypeMetaModel(JavaParserMetaModel parent, Optional<BaseNodeMetaModel> superBaseNodeMetaModel) {
        super(superBaseNodeMetaModel, parent, com.github.javaparser.ast.type.UnionType.class, "UnionType", "com.github.javaparser.ast.type.UnionType", "com.github.javaparser.ast.type", false);
    }

    public PropertyMetaModel elementsPropertyMetaModel;
}

