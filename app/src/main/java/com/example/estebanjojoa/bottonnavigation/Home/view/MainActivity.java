package com.example.estebanjojoa.bottonnavigation.Home.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.estebanjojoa.bottonnavigation.Fragment1;
import com.example.estebanjojoa.bottonnavigation.Fragment2;
import com.example.estebanjojoa.bottonnavigation.Fragment3;
import com.example.estebanjojoa.bottonnavigation.FragmentProfile;
import com.example.estebanjojoa.bottonnavigation.R;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView botto_navigation;
    RecyclerView recyclerViewProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewProducts=(RecyclerView)findViewById(R.id.id_rcv_products);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewProducts.setLayoutManager(linearLayoutManager);

        botto_navigation = (BottomNavigationView) findViewById(R.id.botton_navigation);
        botto_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.Item_shop:
                         Fragment1 fragment1 = new Fragment1();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, fragment1)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                    case R.id.Item_buy:
                        Fragment2 fragment2 = new Fragment2();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, fragment2)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                    case R.id.Item_fav:
                        Fragment3 fragment3 = new Fragment3();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, fragment3)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;

                    case R.id.Item_user:
                        FragmentProfile fragment4 = new FragmentProfile();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.frameLayout, fragment4)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();

                        break;
                }
                return true;
            }

        });

    }

}
