package com.example.estebanjojoa.bottonnavigation.Home.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.estebanjojoa.bottonnavigation.Login.view.Login;
import com.example.estebanjojoa.bottonnavigation.Products.view.FragmentProducts;
import com.example.estebanjojoa.bottonnavigation.Supermarket.view.SupermarketFragment;
import com.example.estebanjojoa.bottonnavigation.Fragment3;
import com.example.estebanjojoa.bottonnavigation.FragmentProfile;

import com.example.estebanjojoa.bottonnavigation.R;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView botto_navigation;
    SharedPreferences sharedPreferences;
    //RecyclerView recyclerViewProducts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //homePresenter= new HomePresenterImpl(this);
        //homePresenter.getDataProducts();
        botto_navigation = (BottomNavigationView) findViewById(R.id.botton_navigation);
      initSharedPreferences();

        }
        public void initBottomNavigationView(){
            botto_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {


                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.Item_pro:
                            FragmentProducts fragment1 = new FragmentProducts();
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.framelayout, fragment1)
                                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                    .addToBackStack(null)
                                    .commit();

                            break;
                        case R.id.Item_market:
                            SupermarketFragment fragment2 = new SupermarketFragment();
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.framelayout, fragment2)
                                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                    .addToBackStack(null)
                                    .commit();

                            break;
                        case R.id.Item_fav:
                            Fragment3 fragment3 = new Fragment3();
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.framelayout, fragment3)
                                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                    .addToBackStack(null)
                                    .commit();

                            break;

                        case R.id.Item_user:
                            FragmentProfile fragment4 = new FragmentProfile();
                            getSupportFragmentManager()
                                    .beginTransaction()
                                    .replace(R.id.framelayout, fragment4)
                                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                    .addToBackStack(null)
                                    .commit();

                            break;
                    }
                    return true;
                }

            });
        }
    public void initSharedPreferences(){

        sharedPreferences = getSharedPreferences("PreferencesLogin", Context.MODE_PRIVATE);

        String user = sharedPreferences.getString("user", null);

        if ( (user == null) || (user.equals("")) ){
            Intent intent = new Intent(this, Login.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }else {
            initBottomNavigationView();
        }

    }



}
