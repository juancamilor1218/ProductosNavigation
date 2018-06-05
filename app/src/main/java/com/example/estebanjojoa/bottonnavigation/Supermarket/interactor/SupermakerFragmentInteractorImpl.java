package com.example.estebanjojoa.bottonnavigation.Supermarket.interactor;

import com.example.estebanjojoa.bottonnavigation.Supermarket.model.Supermarket;
import com.example.estebanjojoa.bottonnavigation.Supermarket.presenter.SupermarketFragmentPresenter;
import com.example.estebanjojoa.bottonnavigation.Supermarket.repository.SupermarketFragmentRepository;
import com.example.estebanjojoa.bottonnavigation.Supermarket.repository.SupermarketFragmentRepositoryImpl;

import java.util.List;

public class SupermakerFragmentInteractorImpl implements SupermarketFragmentInteractor {
private SupermarketFragmentPresenter supermarketFragmentPresenter;
private SupermarketFragmentRepository supermarketFragmentRepository;

    public SupermakerFragmentInteractorImpl(SupermarketFragmentPresenter supermarketFragmentPresenter) {
        this.supermarketFragmentPresenter = supermarketFragmentPresenter;
        supermarketFragmentRepository= new SupermarketFragmentRepositoryImpl(this);
    }

    @Override

    public void getDataCompany() {
        supermarketFragmentRepository.getDataCompany();

    }

    @Override
    public void showResultCompany(List<Supermarket> supermarketList) {
        supermarketFragmentPresenter.showResultCompany(supermarketList);
    }
}
