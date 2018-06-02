package com.example.estebanjojoa.bottonnavigation.Products.presenter;

import com.example.estebanjojoa.bottonnavigation.Products.model.Product;
import com.example.estebanjojoa.bottonnavigation.Products.interactor.ProductsFragmentInteractor;
import com.example.estebanjojoa.bottonnavigation.Products.interactor.ProductsFragmentInteractorImpl;
import com.example.estebanjojoa.bottonnavigation.Products.view.FragmentProductsView;

import java.util.List;

/**
 * Created by Acer on 31/05/2018.
 */

public class ProductsFragmentPresenterImpl implements ProductsFragmentPresenter {
    private FragmentProductsView productsView;
    private ProductsFragmentInteractor productsFragmentInteractor;

    public ProductsFragmentPresenterImpl(FragmentProductsView productsView) {
        this.productsView = productsView;
        productsFragmentInteractor= new ProductsFragmentInteractorImpl(this);
    }

    @Override
    public void showResultProducts(List<Product> productList) {
        productsView.showResultProducts(productList);
    }

    @Override
    public void getDataProducts() {
        productsFragmentInteractor.getDataProducts();
    }
}
