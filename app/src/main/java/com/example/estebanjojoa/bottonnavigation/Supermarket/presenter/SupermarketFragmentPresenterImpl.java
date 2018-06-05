package com.example.estebanjojoa.bottonnavigation.Supermarket.presenter;

import com.example.estebanjojoa.bottonnavigation.Supermarket.interactor.SupermakerFragmentInteractorImpl;
import com.example.estebanjojoa.bottonnavigation.Supermarket.interactor.SupermarketFragmentInteractor;
import com.example.estebanjojoa.bottonnavigation.Supermarket.model.Supermarket;
import com.example.estebanjojoa.bottonnavigation.Supermarket.repository.SupermarketFragmentRepository;
import com.example.estebanjojoa.bottonnavigation.Supermarket.view.SupermarketFragmentView;

import java.util.List;

public class SupermarketFragmentPresenterImpl implements SupermarketFragmentPresenter{
    private SupermarketFragmentInteractor supermarketFragmentInteractor;
    private SupermarketFragmentView supermarketFragmentView;

    public SupermarketFragmentPresenterImpl(SupermarketFragmentView supermarketFragmentView) {
        this.supermarketFragmentView = supermarketFragmentView;
        supermarketFragmentInteractor= new SupermakerFragmentInteractorImpl(this);
    }

    @Override
    public void showResultCompany(List<Supermarket> supermarketList) {
        supermarketFragmentView.showResultCompany(supermarketList);
    }

    @Override
    public void getDataCompany() {
        supermarketFragmentInteractor.getDataCompany();
    }
}
