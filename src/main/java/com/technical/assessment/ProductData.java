package com.technical.assessment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductData {

    private Id _id;
    private String _class;
    private String additionalImages;
    private String catalogClass;
    private String catalogName;
    private String catalogVersion;
    private String categoryName;
    private List<String> categoryPath;
    private List<Product> classificationAttributeList;

    public ProductData() {
    }

    public ProductData(Id _id, String _class, String additionalImages, String catalogClass, String catalogName, String catalogVersion, String categoryName, List<String> categoryPath, List<Product> classificationAttributeList) {
        super();
        this._id = _id;
        this._class = _class;
        this.additionalImages = additionalImages;
        this.catalogClass = catalogClass;
        this.catalogName = catalogName;
        this.catalogVersion = catalogVersion;
        this.categoryName = categoryName;
        this.categoryPath = categoryPath;
        this.classificationAttributeList = classificationAttributeList;
    }

    public List<Product> getClassificationAttributeList() {
        return classificationAttributeList;
    }

    public void setClassificationAttributeList(List<Product> classificationAttributeList) {
        this.classificationAttributeList = classificationAttributeList;
    }
}
