package com.xiong.dp.builder;

public class ProductBuilder {
    private Product product = new Product();

    public void buildName(String name) {
        product.setName(name);
    }

    public void buildPrice(Integer price) {
        product.setPrice(price);
    }

    public Product create() {
        return product;
    }
}
