package com.example.estebanjojoa.bottonnavigation.Products.presenter;

import com.example.estebanjojoa.bottonnavigation.Products.model.Product;

import java.util.List;

/**
 * Created by Acer on 31/05/2018.
 */

public interface ProductsFragmentPresenter {
    void showResultProducts(List<Product> productList);
    void getDataProducts();
}
