package com.example.estebanjojoa.bottonnavigation.Supermarket.presenter;

import com.example.estebanjojoa.bottonnavigation.Products.model.Product;
import com.example.estebanjojoa.bottonnavigation.Supermarket.model.Supermarket;

import java.util.List;

public interface SupermarketFragmentPresenter {
    void showResultCompany(List<Supermarket> supermarketList);
    void getDataCompany();
}
