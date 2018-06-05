package com.example.estebanjojoa.bottonnavigation.Supermarket.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.estebanjojoa.bottonnavigation.Products.adapter.ProductsAdapter;
import com.example.estebanjojoa.bottonnavigation.Products.model.Product;
import com.example.estebanjojoa.bottonnavigation.R;
import com.example.estebanjojoa.bottonnavigation.Supermarket.model.Supermarket;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class SupermarketAdapter extends RecyclerView.Adapter {
    List<Supermarket> supermarketList;
    Context context;

    public SupermarketAdapter(List<Supermarket> supermarketList, Context context) {
        this.supermarketList = supermarketList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_supermarket, parent, false);
        return new ViewHolderSupermarket(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            Supermarket object= supermarketList.get(position);
            ViewHolderSupermarket viewHolderSupermarket= (ViewHolderSupermarket) holder;
            viewHolderSupermarket.textViewSupermarket.setText(object.getName());
            Picasso.get().load(object.getLogo()).into(viewHolderSupermarket.circleImageViewSupermarket);

    }

    @Override
    public int getItemCount() {
        return supermarketList.size();
    }
    public class ViewHolderSupermarket extends RecyclerView.ViewHolder{
        TextView textViewSupermarket;
        CircleImageView circleImageViewSupermarket;

        public ViewHolderSupermarket(View item) {
            super(item);

           textViewSupermarket=item.findViewById(R.id.id_tv_supermercado);
           circleImageViewSupermarket=item.findViewById(R.id.id_cv_empresa);
        }
    }
}

