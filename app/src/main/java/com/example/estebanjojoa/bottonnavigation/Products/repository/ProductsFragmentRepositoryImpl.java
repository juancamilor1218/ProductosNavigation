package com.example.estebanjojoa.bottonnavigation.Products.repository;

import com.example.estebanjojoa.bottonnavigation.ApiRest.RestApiAdapter;
import com.example.estebanjojoa.bottonnavigation.ApiRest.Service;


import com.example.estebanjojoa.bottonnavigation.Products.model.Product;
import com.example.estebanjojoa.bottonnavigation.Products.interactor.ProductsFragmentInteractor;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Acer on 30/05/2018.
 */

public class ProductsFragmentRepositoryImpl implements ProductsFragmentRespository {
    private ProductsFragmentInteractor productsFragmentInteractor;
    List<Product> productList;

    public ProductsFragmentRepositoryImpl(ProductsFragmentInteractor productsFragmentInteractor) {
        this.productsFragmentInteractor = productsFragmentInteractor;
    }

    @Override
    public void getDataProduct() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Product>> products = service.getDataProducts();
       products.enqueue(new Callback<List<Product>>() {
           @Override
           public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
               productList=response.body();
               productsFragmentInteractor.showResultProducts(productList);
           }

           @Override
           public void onFailure(Call<List<Product>> call, Throwable t) {
            //
               productList=null;
           }
       });



    }
}
