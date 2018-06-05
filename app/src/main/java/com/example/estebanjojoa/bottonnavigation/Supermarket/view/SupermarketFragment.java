package com.example.estebanjojoa.bottonnavigation.Supermarket.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.estebanjojoa.bottonnavigation.Products.adapter.ProductsAdapter;
import com.example.estebanjojoa.bottonnavigation.Products.presenter.ProductsFragmentPresenterImpl;
import com.example.estebanjojoa.bottonnavigation.R;
import com.example.estebanjojoa.bottonnavigation.Supermarket.adapter.SupermarketAdapter;
import com.example.estebanjojoa.bottonnavigation.Supermarket.model.Supermarket;
import com.example.estebanjojoa.bottonnavigation.Supermarket.presenter.SupermarketFragmentPresenter;
import com.example.estebanjojoa.bottonnavigation.Supermarket.presenter.SupermarketFragmentPresenterImpl;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SupermarketFragment extends Fragment implements SupermarketFragmentView {
    RecyclerView recyclerViewSupermarket;
    SupermarketFragmentPresenter supermarketFragmentPresenter;
    public SupermarketFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_supermakert, container, false);
        recyclerViewSupermarket=(RecyclerView)view.findViewById(R.id.id_rcv_supermakert);
        recyclerViewSupermarket.setLayoutManager(new LinearLayoutManager(getContext()));
        supermarketFragmentPresenter =new SupermarketFragmentPresenterImpl(this);
        supermarketFragmentPresenter.getDataCompany();
        return view;
    }

    @Override
    public void showResultCompany(List<Supermarket> supermarketList) {
        recyclerViewSupermarket.setAdapter(new SupermarketAdapter(supermarketList,getContext()));
        recyclerViewSupermarket.setVisibility(View.VISIBLE);

    }
}
