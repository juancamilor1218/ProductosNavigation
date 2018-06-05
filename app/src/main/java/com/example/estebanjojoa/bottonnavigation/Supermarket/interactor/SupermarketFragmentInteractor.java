package com.example.estebanjojoa.bottonnavigation.Supermarket.interactor;

import com.example.estebanjojoa.bottonnavigation.Supermarket.model.Supermarket;

import java.util.List;

public interface SupermarketFragmentInteractor {
    void getDataCompany();
    void showResultCompany(List<Supermarket> supermarketList);
}
