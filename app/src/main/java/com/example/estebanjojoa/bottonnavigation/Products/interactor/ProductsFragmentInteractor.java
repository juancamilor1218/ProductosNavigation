package com.example.estebanjojoa.bottonnavigation.Products.interactor;

import com.example.estebanjojoa.bottonnavigation.Products.model.Product;

import java.util.List;

/**
 * Created by Acer on 30/05/2018.
 */

public interface ProductsFragmentInteractor {
    void getDataProducts();
    void showResultProducts(List<Product> productList);
}
