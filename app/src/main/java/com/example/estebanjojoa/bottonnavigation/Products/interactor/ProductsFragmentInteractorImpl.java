package com.example.estebanjojoa.bottonnavigation.Products.interactor;

import com.example.estebanjojoa.bottonnavigation.Products.model.Product;
import com.example.estebanjojoa.bottonnavigation.Products.presenter.ProductsFragmentPresenter;
import com.example.estebanjojoa.bottonnavigation.Products.repository.ProductsFragmentRepositoryImpl;
import com.example.estebanjojoa.bottonnavigation.Products.repository.ProductsFragmentRespository;

import java.util.List;

/**
 * Created by Acer on 31/05/2018.
 */

public class ProductsFragmentInteractorImpl implements ProductsFragmentInteractor{
    ProductsFragmentPresenter productsFragmentPresenter;
    ProductsFragmentRespository productsFragmentRespository;

    public ProductsFragmentInteractorImpl(ProductsFragmentPresenter productsFragmentPresenter) {
        this.productsFragmentPresenter = productsFragmentPresenter;
        productsFragmentRespository= new ProductsFragmentRepositoryImpl(this);
    }


    @Override
    public void getDataProducts() {
        productsFragmentRespository.getDataProduct();
    }

    @Override
    public void showResultProducts(List<Product> productList) {
        productsFragmentPresenter.showResultProducts(productList);
    }
}
