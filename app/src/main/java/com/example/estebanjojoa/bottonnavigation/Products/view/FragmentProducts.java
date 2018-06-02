package com.example.estebanjojoa.bottonnavigation.Products.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;


import com.example.estebanjojoa.bottonnavigation.Products.model.Product;
import com.example.estebanjojoa.bottonnavigation.Products.adapter.ProductsAdapter;
import com.example.estebanjojoa.bottonnavigation.Products.presenter.ProductsFragmentPresenter;
import com.example.estebanjojoa.bottonnavigation.Products.presenter.ProductsFragmentPresenterImpl;
import com.example.estebanjojoa.bottonnavigation.R;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentProducts extends Fragment implements FragmentProductsView {
    RecyclerView recyclerViewProducts;

    private ProductsFragmentPresenter productsFragmentPresenter;

    public FragmentProducts() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_products, container, false);
        recyclerViewProducts=(RecyclerView)view.findViewById(R.id.id_rcv_products);

        recyclerViewProducts.setLayoutManager(new LinearLayoutManager(getContext()));

        productsFragmentPresenter =new ProductsFragmentPresenterImpl(this);

         productsFragmentPresenter.getDataProducts();

        return view;

    }

    @Override
    public void showResultProducts(List<Product> productList) {

        recyclerViewProducts.setAdapter(new ProductsAdapter(productList,getContext()));
        recyclerViewProducts.setVisibility(View.VISIBLE);
    }
}
