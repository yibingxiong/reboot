package com.xiong.dp.factory;

/**
 * 静态工厂
 */
public class ProductFactory2 {
    private ProductFactory2() {
    }

    static Product createProduct(Class<Product> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return product;
    }
}
