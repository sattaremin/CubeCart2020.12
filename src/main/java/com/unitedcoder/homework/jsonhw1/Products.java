package com.unitedcoder.homework.jsonhw1;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Products {
    @JsonProperty("productList")
    private List<ProductHW> productList;
    public Products(List<ProductHW> productList) {
        this.productList = productList;
    }
}
