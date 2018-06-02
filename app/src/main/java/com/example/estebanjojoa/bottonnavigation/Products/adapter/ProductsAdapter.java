package com.example.estebanjojoa.bottonnavigation.Products.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.estebanjojoa.bottonnavigation.Products.model.Product;
import com.example.estebanjojoa.bottonnavigation.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Acer on 30/05/2018.
 */

public class ProductsAdapter extends RecyclerView.Adapter {
    List<Product> productList;
    Context context;
    public ProductsAdapter(List<Product> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_producto, parent, false);
        return new ViewHolderProduct(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        System.out.println(productList);
        Product object=productList.get(position);
        ViewHolderProduct viewHolderProduct=(ViewHolderProduct) holder;
        viewHolderProduct.textViewTitle.setText(object.getTitle());
        viewHolderProduct.textViewPrice.setText(String.valueOf(object.getPrecio()));
        //viewHolderProduct.textViewSale.setText(String.valueOf(object.getOferta()));
       Picasso.get().load(object.getLogo()).into(viewHolderProduct.imageViewProduct);
       if(object.getOferta()==0) {
           viewHolderProduct.textViewSale.setVisibility(View.VISIBLE);
       }else {
           viewHolderProduct.textViewSale.setVisibility(View.GONE);
       }
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }


    public class ViewHolderProduct extends RecyclerView.ViewHolder{
        TextView textViewSale,textViewTitle,textViewPrice;
        ImageView imageViewProduct;

        public ViewHolderProduct(View item) {
            super(item);
            textViewTitle=item.findViewById(R.id.id_tv_product);
            textViewSale=item.findViewById(R.id.id_tv_sale);
            textViewPrice=item.findViewById(R.id.id_tv_price);
            imageViewProduct=item.findViewById(R.id.id_iv_product);
        }
    }
}
