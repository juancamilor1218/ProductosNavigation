package com.example.estebanjojoa.bottonnavigation.Supermarket.repository;

import com.example.estebanjojoa.bottonnavigation.ApiRest.RestApiAdapter;
import com.example.estebanjojoa.bottonnavigation.ApiRest.Service;
import com.example.estebanjojoa.bottonnavigation.Supermarket.interactor.SupermarketFragmentInteractor;
import com.example.estebanjojoa.bottonnavigation.Supermarket.model.Supermarket;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SupermarketFragmentRepositoryImpl implements SupermarketFragmentRepository {
    SupermarketFragmentInteractor supermarketFragmentInteractor;
    List<Supermarket> supermakertList;

    public SupermarketFragmentRepositoryImpl(SupermarketFragmentInteractor supermarketFragmentInteractor) {
        this.supermarketFragmentInteractor = supermarketFragmentInteractor;
    }

    @Override
    public void getDataCompany() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Supermarket>> company= service.getDataCompany();
        company.enqueue(new Callback<List<Supermarket>>() {
            @Override
            public void onResponse(Call<List<Supermarket>> call, Response<List<Supermarket>> response) {
                supermakertList=response.body();
                supermarketFragmentInteractor.showResultCompany(supermakertList);
            }

            @Override
            public void onFailure(Call<List<Supermarket>> call, Throwable t) {
                System.out.println("no llego");
            }
        });

    }
}
