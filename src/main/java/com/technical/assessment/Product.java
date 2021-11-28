package com.technical.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    private String name;
    private String value;
    private String fullQualifier;
    private String classificationClass;
    private String qualifier;

    public Product() {
    }

    public Product(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }

    public Product(String name, String value, String fullQualifier, String classificationClass, String qualifier) {
        super();
        this.name = name;
        this.value = value;
        this.fullQualifier = fullQualifier;
        this.classificationClass = classificationClass;
        this.qualifier = qualifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFullQualifier() {
        return fullQualifier;
    }

    public void setFullQualifier(String fullQualifier) {
        this.fullQualifier = fullQualifier;
    }

    public String getClassificationClass() {
        return classificationClass;
    }

    public void setClassificationClass(String classificationClass) {
        this.classificationClass = classificationClass;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    @Override
    public String toString() {
        return "classificationAttributeList [name=" + name + ", value=" + value+ "]";
    }
}