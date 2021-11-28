package com.technical.assessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/product")
public class ProductController {
    public static final String test_url = "https://test-api.skulibrary.dev/getTestProductData";

    @Autowired
    private ProductDAO productDAO;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @GetMapping(path="/", produces = "application/json")
    public Products getProducts()
    {
        return productDAO.getAllProducts();
    }

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addProduct(@RequestBody Product product)
    {

        productDAO.addProduct(product);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(product.getName())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping(path="/testUrl", produces = "application/json")
    public Products getProductsFromUrl()
    {
        RestTemplate restTemplate = new RestTemplate();
        ProductData productData = restTemplate.getForObject(test_url, ProductData.class);

        Products list = new Products();
        String name;
        String value;
        String fullQualifier;
        String classificationClass;
        String qualifier;

        for(int i = 0; i < productData.getClassificationAttributeList().size(); i++){
            name = productData.getClassificationAttributeList().get(i).getName();
            value = productData.getClassificationAttributeList().get(i).getValue();
            fullQualifier = productData.getClassificationAttributeList().get(i).getFullQualifier();
            classificationClass = productData.getClassificationAttributeList().get(i).getClassificationClass();
            qualifier = productData.getClassificationAttributeList().get(i).getQualifier();
            list.getProductList().add(new Product(name, value, fullQualifier, classificationClass, qualifier));
        }

        return list;
    }

}